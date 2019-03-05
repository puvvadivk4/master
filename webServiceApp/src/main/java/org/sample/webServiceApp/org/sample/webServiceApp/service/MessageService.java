package org.sample.webServiceApp.org.sample.webServiceApp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.sample.webServiceApp.org.sample.webServiceApp.models.Message;

public class MessageService {

	 List<Message> list =new ArrayList<Message>();
	 CommentService service = new CommentService();
	 
	public MessageService()
	{
		list.add(new Message(1, "id ones message"));
		list.add(new Message(2, "id two message"));
		list.add(new Message(3, "id three message"));
		
		System.out.println("Service..................");
	}

	public List<Message> getAllMessages()
	{
		return list;
	}

	public boolean addMessage(Message msg) {
		return list.add(msg);

	}

	public void updateById(Message msg,int id) {

		list.forEach(x ->
		{	if(x.getMsgId()==id)			
		{
			x.setDate(new Date());
			x.setMsgValue(msg.getMsgValue());				
		}
		}	);
	}
	
	public boolean deleteById(int id) {

		return list.removeIf(x->x.getMsgId()==id);
	}

}
