package org.sample.webServiceApp.org.sample.webServiceApp;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.sample.webServiceApp.org.sample.webServiceApp.exceptions.UDefinedException;
import org.sample.webServiceApp.org.sample.webServiceApp.models.Message;
import org.sample.webServiceApp.org.sample.webServiceApp.service.CommentService;
import org.sample.webServiceApp.org.sample.webServiceApp.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
static	 MessageService service=new MessageService();
	
	public MyResource()
	 {
		 System.out.println("MyResource...................");
	 }
	
	
    @GET
   // @Path("getmessages")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getIt() {
        //Response.status(Status.BAD_GATEWAY).entity(entity)
    	return service.getAllMessages();
        
    }
    
    @POST
   // @Path("add")
    //@Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public boolean postIt(Message msg) {
        
    	return service.addMessage(msg);
    }
    
//    @GET
//    @Path("get/{id}/subid/{subid}")
//    @Produces(MediaType.TEXT_PLAIN)
//    public int getById(@PathParam(value="id") int id,@PathParam("subid") int subid) {
//        return subid;
//    }
    
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getById(@PathParam(value="id") int id) {
    	
    	Message m=service.getAllMessages().stream().filter(x->
    	x.getMsgId()==id).findAny().orElse(null);
    	
    	if(m==null)
    	{
    		throw new UDefinedException("Id Not found-->"+id);
    	}
    	
        return m;
    }
    
    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void updateById(@PathParam(value="id") int id,Message msg) {
         service.updateById(msg, id);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteById(@PathParam(value="id") int id) {
        return  service.deleteById(id);
    }
    
    
    //Comments
    
	@Path("/message/{messageid}/comments")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CommentService getMessageCommenst(@PathParam(value="messageid") int messageid) {
		
        return new CommentService();
    }
    
    
    
}
	
