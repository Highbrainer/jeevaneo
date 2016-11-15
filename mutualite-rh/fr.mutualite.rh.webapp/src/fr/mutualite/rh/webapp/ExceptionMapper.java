package fr.mutualite.rh.webapp;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;

@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Throwable> {
	private Logger log = Logger.getLogger(getClass());

	public Response toResponse(Throwable ex) {
		log.error("",ex);
		return Response.status(500).entity(ex.getMessage() + "\n\n" + ex.getClass().getName()).type("text/plain").build();
	}
}