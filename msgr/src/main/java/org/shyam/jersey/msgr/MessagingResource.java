package org.shyam.jersey.msgr;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.shyam.jersey.msgr.model.Message;

import org.shyam.jersey.msgr.service.MessageService;

@Path("/messages")
public class MessagingResource {
	
	MessageService msgSrv = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return msgSrv.getAllMessages();
	}

}
