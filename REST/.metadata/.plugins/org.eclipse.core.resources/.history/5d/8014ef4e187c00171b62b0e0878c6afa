package org.koushik.practice.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.koushik.practice.test.database.DatabaseClient;
import org.koushik.practice.test.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClient.getMessages();

	public MessageService(){
		messages.put(1L, new Message(1, "Hello Jersy", "koushik"));
		messages.put(2L, new Message(2, "Hello jax-rs", "koushik"));
	}
	
	//Get all the messages
	public List<Message> getAllMessages(){	
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long messageId){
		return messages.get(messageId);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id); 
	}
}
