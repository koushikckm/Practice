package org.koushik.practice.test.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentsController {

	@GET
	public String testSubResource(){
		return "new sub resource";
	}
	
	@GET
	@Path("/{commentId}")
	public String testSubResource1(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId){
		return "Another sub resource "+"Message Id : "+messageId+" Comment Id : "+commentId;
	}
}
