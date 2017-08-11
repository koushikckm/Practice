package org.koushik.practice.rest;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import java.util.Calendar;
import java.util.Date;

import javax.inject.Singleton;
import javax.ws.rs.GET;

@Path("{pathParam}/test")
//@Singleton
public class MyResource {

	private int count;
	@PathParam("pathParam") private String pathParamExample;
	@QueryParam("query") private String queryParamExample;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		count = count+1;
		return "This method is called "+count+" time(s)"
				+" Path param used : "+pathParamExample
				+" Query param used : "+queryParamExample;
	}
	
}
