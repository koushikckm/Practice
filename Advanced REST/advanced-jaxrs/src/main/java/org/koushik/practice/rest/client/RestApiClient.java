package org.koushik.practice.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.koushik.practice.test.model.Message;

public class RestApiClient {

	public static void main(String[] args) {
		/*
		 Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/advanced-jaxrs/webapi/messages/1");
		Builder builder = target.request();
		Response response = builder.get();
		Message message = response.readEntity(Message.class);
		
		System.out.println(message.getMessage());
		 */
		
		Client client = ClientBuilder.newClient();
		
		Response response = client.target("http://localhost:8080/advanced-jaxrs/webapi/messages/1")
		.request(MediaType.APPLICATION_JSON)
		.get();
		
		Message message = response.readEntity(Message.class);
		System.out.println(message.getMessage());
		
	}
}
