package org.koushik.practice.test.controller;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.koushik.practice.test.model.Message;
import org.koushik.practice.test.model.MessageFilterBean;
import org.koushik.practice.test.service.MessageService;


/*
 * 
 * @QueryParam
 * @BeanParam
 * 
 */


@Path("messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageController {

	MessageService messageService = new MessageService();
	
	@GET 
	public List<Message> getMessages(@QueryParam("year") int year,
			@QueryParam("start") int start,
			@QueryParam("size") int size){
	/*
	 * Instead of multiple query params, we can also use BeanParam to access all query params
	 */
	//public List<Message> getMessages(@BeanParam MessageFilterBean filterBean){

		if (year>0){
			return messageService.getAllMessagesForYear(year);
		}
		if(start>=0 && size>=1){
			return messageService.getAllMessagesPaginated(start, size);
		}
		
		/*if (filterBean.getYear()>0){
			return messageService.getAllMessagesForYear(filterBean.getYear());
		}
		if(filterBean.getStart()>=0 && filterBean.getSize()>=1){
			return messageService.getAllMessagesPaginated(filterBean.getStart(), filterBean.getSize());
		}*/
		
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long messageId){
		return messageService.getMessage(messageId);
	}
	
	@POST
	public Message addMessage(Message message){
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long messageId, Message message){
		message.setId(messageId); 
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public Message removeMessage(@PathParam("messageId") long messageId){
		return messageService.removeMessage(messageId);
	}
	
	
	/*
	 * 
	 * 
	 * Implementing sub resources
	 * The below method will be mapped to the api in CommentsController
	 * the call to below path will call the api in CommentsController
	 * 
	 */
	
	@Path("/{messageId}/comments")
	public CommentsController getCommentsResource(){
		return new CommentsController();
	}
}
