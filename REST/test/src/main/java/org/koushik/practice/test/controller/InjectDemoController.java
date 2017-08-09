package org.koushik.practice.test.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/*
 * 
 * @MatrixParam
 * @HeaderParam
 * @CookieParam
 * @Context
 * 
 */

@Path("injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoController {

	@GET
	@Path("annotations")
	public String getMatrixParam(@MatrixParam("param") String matrixParam,
			@HeaderParam("customHeader") String customHeader,
			@CookieParam("name") String cookie){
		return "Matrix param : "+matrixParam + " Custom header : "+customHeader + 
				" Cookie : "+cookie;
	}
	
	@GET
	@Path("context")
	public String getParamsUsingContext(@Context UriInfo uriInfo,
			@Context HttpHeaders header){
		String path = uriInfo.getAbsolutePath().toString();
		String cookie = header.getCookies().toString();
		return "Path : "+path + " Cookies : "+ cookie;
	}
}
