package org.shyam.jersey.msgr.service;

import java.util.ArrayList;
import java.util.List;

import org.shyam.jersey.msgr.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello World!", "Shyam");
		Message m2 = new Message(2L, "Hello Jersey!", "Nidhi");
		List<Message> msgList = new ArrayList<>();
		msgList.add(m1);
		msgList.add(m2);
		return msgList;
		
	}

}
