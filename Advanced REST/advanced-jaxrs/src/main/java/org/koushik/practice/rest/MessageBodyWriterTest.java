package org.koushik.practice.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class MessageBodyWriterTest {


	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Date getCurrentDate(){
		return Calendar.getInstance().getTime();
	}
}
