package org.superlamer.rest.messanger.service;

import java.util.ArrayList;
import java.util.List;

import org.superlamer.rest.messanger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1, "Hello World!", "Rado");
		Message m2 = new Message(2, "Hello Jersey!", "Rado");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
