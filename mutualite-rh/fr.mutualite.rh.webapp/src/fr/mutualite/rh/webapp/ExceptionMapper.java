package fr.mutualite.rh.webapp;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;

@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Throwable> {
	private Logger log = Logger.getLogger(getClass());

	public Response toResponse(Throwable ex) {
		log.error("",ex);
		if (ex instanceof WebApplicationException) {
			WebApplicationException wae = (WebApplicationException) ex;
			return Response.status(wae.getResponse().getStatus()).entity(ex.getMessage()).type("text/plain").build();
		}
		return Response.status(500).entity(ex.getMessage() + "\n\n" + ex.getClass().getName()).type("text/plain").build();
	}
}