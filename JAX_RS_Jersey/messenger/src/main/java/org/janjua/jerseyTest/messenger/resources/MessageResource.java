package org.janjua.jerseyTest.messenger.resources;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.janjua.jerseyTest.messenger.service.MessageService;
import org.janjua.jerseyTest.messenger.model.Message;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessageAnnotated(@PathParam("messageId") long messageId){
		return messageService.getMessage(messageId);
	}
	
	
} 