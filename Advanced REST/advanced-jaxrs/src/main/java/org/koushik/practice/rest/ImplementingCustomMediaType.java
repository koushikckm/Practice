package org.koushik.practice.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("mediatype")
public class ImplementingCustomMediaType {

	@GET
	@Produces("text/shortdate")
	public Date testMethod(){
		return Calendar.getInstance().getTime();
	}
}
