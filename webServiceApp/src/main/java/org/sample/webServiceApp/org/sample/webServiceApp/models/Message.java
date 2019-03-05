package org.sample.webServiceApp.org.sample.webServiceApp.models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	private int msgId;
	private Date date;
	private String msgValue;
	private Map<Long,Comments> comments=new HashMap<Long,Comments>();

	public Message()
	{
		System.out.println("Message Model.....................");
	}
	public Map<Long, Comments> getComments() {
		return comments;
	}
	public void setComments(Map<Long, Comments> comments) {
		this.comments = comments;
	}
	public Message(int msgId, String msgValue ) {
		System.out.println("Message const Model.....................");
		this.msgId = msgId;
		this.msgValue = msgValue;
		this.date=new Date();
	//	this.comments=(Map<Long, Comments>) c;
	}
	
	public Message(int msgId, String msgValue, Map<Long, Comments> c) {
		System.out.println("Message const Model.....................");
		this.msgId = msgId;
		this.msgValue = msgValue;
		this.date=new Date();
	    this.comments=(Map<Long, Comments>) c;
	}
	
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMsgValue() {
		return msgValue;
	}
	public void setMsgValue(String msgValue) {
		this.msgValue = msgValue;
	}



}