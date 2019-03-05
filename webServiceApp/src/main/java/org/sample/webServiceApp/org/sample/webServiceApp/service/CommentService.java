package org.sample.webServiceApp.org.sample.webServiceApp.service;

import java.util.ArrayList;
import java.util.List;

import org.sample.webServiceApp.org.sample.webServiceApp.models.Comments;


//@Path("/dd")
public class CommentService {

	List<Comments> list =new ArrayList<Comments>();
	
	public CommentService() {
		list.add(new Comments(1, "comment 1 id"));
		list.add(new Comments(2, "comment 2 id"));
		list.add(new Comments(3, "comment 3 id"));
	}

//	@GET
	public List<Comments> getrCommentss()
	{
		System.out.println("-------------->");
		return list;
	}
	public void postComments(Comments c)
	{
		 list.add(c);
	}
	 
	 
	
}

