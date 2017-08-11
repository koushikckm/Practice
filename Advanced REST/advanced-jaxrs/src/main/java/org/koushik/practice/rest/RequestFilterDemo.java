package org.koushik.practice.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class RequestFilterDemo implements ContainerRequestFilter, ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

		System.out.println("***Req filter****");
		System.out.println("Req headers : "+requestContext.getHeaders());
	}

	@Override
	public void filter(ContainerRequestContext arg0, 
			ContainerResponseContext responseContext) throws IOException {
		
		System.out.println("****Response filter****");
		System.out.println("Response headers : "+responseContext.getHeaders());
		
		
	}

}
