package org.koushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Message;

public class MessageService {

		private Map<Long,Message> messages = DatabaseClass.getMessages();
	
		public MessageService(){
			messages.put(1L, new Message(1L,"Hello World","koushik"));
			messages.put(2L, new Message(2L,"Hello Jersey","koushik"));
		}
		
		
		public List<Message> getAllMessages(){
			return new ArrayList<Message>(messages.values());
		}
		
		public Message getMessage(Long id){
			return messages.get(id);
		}
		
		public Message addMessages(Message message){
			message.setId(messages.size() + 1 );
			messages.put(message.getId(),message );
			return message;
		}
		
		public Message updateMessages(Message message){
			if(message.getId() <=0){
				return null;
			}
			messages.put(message.getId(), message);
			return message;
		}
		
		public Message removeMessages(Long id){
			return messages.remove(id);
		}
}