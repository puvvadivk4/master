package org.sample.webServiceApp.org.sample.webServiceApp.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UpredefinedExpMapper implements ExceptionMapper<UDefinedException>{

	@Override
	public Response toResponse(UDefinedException exception) {
		
		try {
			InputStream s=new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ErrorMessage msg = new ErrorMessage(exception.getMessage(), 404, "doc");
		return Response.status(Status.NOT_FOUND).entity(msg).build();
		
		
		
	}

	
}
