package fr.mutualite.rh.ldap;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import fr.mutualite.rh.model.config.ConfigFactory;
import fr.mutualite.rh.model.config.Configuration;

public class LdapClient {

	private Logger log = Logger.getLogger(getClass());

	private Configuration config;

	public LdapClient(Configuration config) {
		super();
		this.config = config;
	}

	public LdapClient() throws IOException {
		this(ConfigFactory.readDefaultConfiguration());
	}

	public SearchResult findAccountByAccountName(DirContext ctx, String ldapSearchBase, String searchFilter, String accountName) throws NamingException {

		String filter = String.format(searchFilter, accountName);
		log.debug(filter);

		SearchControls searchControls = new SearchControls();
		searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);

		NamingEnumeration<SearchResult> results = ctx.search(ldapSearchBase, filter, searchControls);

		SearchResult searchResult = null;
		while (results.hasMoreElements()) {
			searchResult = (SearchResult) results.nextElement();

			log.debug(searchResult.getNameInNamespace());

			// make sure there is not another item available, there should be only 1 match
			if (results.hasMoreElements()) {
				System.err.println("Matched multiple users for the accountName: " + accountName);
			}
		}

		return searchResult;
	}

	public void dumpResultsAsJson(LdapContext ctx, String filter, Writer o) throws NamingException, IOException {
		JsonFactory jfactory = new JsonFactory();

		/*** write to file ***/
		JsonGenerator jg = jfactory.createGenerator(o);

		String base2 = getBase().trim();
		String base = base2 + (base2.isEmpty() ? "" : ",") + getRootDn();
		ctx.setRequestControls(null);
		NamingEnumeration<?> namingEnum = ctx.search(base, filter, getSimpleSearchControls());
		while (namingEnum.hasMore()) {
			jg.writeStartObject();
			SearchResult result = (SearchResult) namingEnum.next();
			String dn = result.getNameInNamespace();
			jg.writeStringField("dn", dn);
			Attributes attributes = result.getAttributes();
			NamingEnumeration<? extends Attribute> attrs = attributes.getAll();
			while (attrs.hasMore()) {
				Attribute attribute = attrs.next();
				String id = attribute.getID();
				int size = attribute.size();
				if (size == 1) {
					Object oValue = attribute.get();
					String value = null;
					if (null != oValue) {
						value = oValue.toString();
					}
					jg.writeStringField(id, value);
				}
			}
			attrs.close();
			jg.writeEndObject();
		}
		namingEnum.close();
		jg.close();
		o.flush();
	}

	public String getLdapUrl() {
		return "ldap://" + config.getLdapServers() + ':' + config.getLdapPort();
	}

	public String getBase() {
		return config.getLdapBase();
	}

	public String getRootDn() {
		return config.getLdapBaseDn();
	}

	private SearchControls getSimpleSearchControls() {
		SearchControls searchControls = new SearchControls();
		searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
		searchControls.setTimeLimit(30000);
		// String[] attrIDs = {"objectGUID"};
		// searchControls.setReturningAttributes(attrIDs);
		return searchControls;
	}

	public String findUniqueUser(LdapContext ctx, String username) throws NamingException {
		return findUniqueDn(ctx, makeFilter(username));
	}

	public String findUniqueDn(LdapContext ctx, String filter) throws NamingException {
		String base2 = getBase().trim();
		String base = base2 + (base2.isEmpty() ? "" : ",") + getRootDn();
		ctx.setRequestControls(null);
		NamingEnumeration<?> namingEnum = ctx.search(base, filter, getSimpleSearchControls());
		while (namingEnum.hasMore()) {
			SearchResult result = (SearchResult) namingEnum.next();
			// Attributes attrs = result.getAttributes ();
			// String uid = attrs.get("uid").get().toString();
			return result.getNameInNamespace();

		}
		namingEnum.close();
		return null;
	}

	public List<String> findDns(LdapContext ctx, String filter) throws NamingException {
		String base2 = getBase().trim();
		String base = base2 + (base2.isEmpty() ? "" : ",") + getRootDn();
		ctx.setRequestControls(null);
		NamingEnumeration<?> namingEnum = ctx.search(base, filter, getSimpleSearchControls());
		List<String> ret = new ArrayList<>();
		while (namingEnum.hasMore()) {
			SearchResult result = (SearchResult) namingEnum.next();
			// Attributes attrs = result.getAttributes ();
			// String uid = attrs.get("uid").get().toString();
			ret.add(result.getNameInNamespace());

		}
		namingEnum.close();
		return ret;
	}

	public String getAdminPassword() {
		return config.getLdapPassword();
	}

	public String getAdminDn() {
		return config.getLdapLogin();
	}

	public String getFilter() {
		return config.getLdapFilter();
	}

	public String makeFilter(String username) {
		return String.format(getFilter(), username);
	}

	public LdapContext bindAsAdmin() throws NamingException {
		return bind(getAdminDn(), getAdminPassword());
	}

	public LdapContext bind(String login, String pass) throws NamingException {
		String ldapURL = getLdapUrl() /* + rootDN */;
		Hashtable<String, String> authEnv = new Hashtable<>();
		authEnv.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		authEnv.put(Context.PROVIDER_URL, ldapURL);
		authEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
		authEnv.put(Context.SECURITY_PRINCIPAL, login);
		authEnv.put(Context.SECURITY_CREDENTIALS, pass);
		authEnv.put(Context.REFERRAL, "follow");

		// DirContext authContext = new InitialDirContext(authEnv);
		LdapContext ctx = new InitialLdapContext(authEnv, null);
		log.debug("Connected as " + login);
		return ctx;
	}

}
