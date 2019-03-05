package org.sample.webServiceApp.org.sample.webServiceApp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/")
public class CommentResource {
	
	@GET
	public String getComments()
	{
		return "test";
	}

}

