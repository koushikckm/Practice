package org.koushik.practice.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class ResponseFilterDemo implements ContainerResponseFilter{

	/*
	 * 
	 * 
	 * (non-Javadoc)
	 * @see javax.ws.rs.container.ContainerResponseFilter#filter(javax.ws.rs.container.ContainerRequestContext, javax.ws.rs.container.ContainerResponseContext)
	 */
	@Override
	public void filter(ContainerRequestContext requestContext, 
			ContainerResponseContext responseContext) throws IOException {

		responseContext.getHeaders().add("response-header-token", "koushik");
	}

}
