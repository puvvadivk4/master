package axa.springtotal.controller;

import java.util.List;

//import javax.websocket.server.PathParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import axa.springtotal.YmlConfigs;
import axa.springtotal.services.TotalEntity;
import axa.springtotal.services.TotalService;

@RestController
public class TotalController {

	public TotalService service=new TotalService();
	@Autowired
    private YmlConfigs myConfig;
	@GetMapping("/welcome")
	public String welcome()
	{	
		return myConfig.getServers().size()+"----asdsad--"+myConfig.getServers().get(0)+"====="+myConfig.getServer()+"@@@@@@@"+myConfig.getName()+"$$$$"+myConfig.getRegTypr();
		
	}
	
	
	
	@GetMapping("/welcome/{id}")
	public String welcomeWithId(@PathVariable int id)
	{
		//@PathParam(value = "id") String id
		//@PathVariable int idd
		return "Welcome GetMapping with path variable as input"+id;
		
	}
	
	@PostMapping("/welcome")
	public String welcomePost()
	{
		return "Welcome simple PostMapping";
		
	}
	
	@PutMapping("/welcome")
	public String welcomePut()
	{
		return "Welcome simple PutMapping";
		
	}
	
	@DeleteMapping("/welcome")
	public String welcomeDelete()
	{
		return "Welcome simple DeleteMapping";
		
	}
	
	//Total example
	
	//get
	@GetMapping("/totals")
	public List<TotalEntity> getAllTotals()
	{	
		return service.getAllTotalEntity();
	}
	
//get id
	@GetMapping("/total/{id}")
	public TotalEntity getById(@PathVariable int id)
	{		
		return service.getById(id);		
	}
	
	//put by id
	@PutMapping("/total/{id}")
	public String updateById(@RequestBody TotalEntity e,@PathVariable int id)
	{		
		return service.updateTotal(e);
		
	}
	
	//POST
	@PostMapping("/total")
	public String addTotal(@RequestBody TotalEntity e)
	{		
		return service.addTotal(e);
		
	}
	
	//Delete
	@DeleteMapping("/total/{id}")
	public String deleteTotal(@PathVariable int id)
	{
		
		return service.deleteTotal(id);
		
	}
	
	//get id REQUEST Mapping
		@GetMapping("/responseentity/{id}")
		public ResponseEntity<TotalEntity> getByIdResponseEntity(@PathVariable int id)
		{		
			
			return new ResponseEntity<TotalEntity>(service.getById(id), HttpStatus.PAYMENT_REQUIRED);		
		}
	
}
