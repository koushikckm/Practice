package org.koushik.practice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("secured")
public class ImplementingAuthorization {

	@GET
	@Path("message")
	@Produces(MediaType.TEXT_PLAIN)
	public String securedApi(){
		return "Success!! This api needs login";
	}
}