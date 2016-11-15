package fr.mutualite.rh.ldap;

import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.naming.ldap.LdapContext;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {
	private Logger log = Logger.getLogger(getClass().getName());

	@Override
	public Object start(IApplicationContext context) throws Exception {
		LdapClient moi = new LdapClient();
		String username = "mtheou";
		LdapContext ctx = moi.bindAsAdmin();
		String dn = moi.findUniqueUser(ctx, username);
		if(null==dn) {
			throw new IllegalArgumentException("User non trouvé : " + username);
		}
		ctx.close();
		ctx = moi.bind(dn, "breizh56");
		moi.dumpResultsAsJson(ctx, moi.makeFilter("*"),	new PrintWriter(System.out));
		
		System.out.println("OK");
		ctx.close();
		System.out.println("Done!");
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
