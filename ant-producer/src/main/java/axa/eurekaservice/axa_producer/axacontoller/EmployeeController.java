package axa.eurekaservice.axa_producer.axacontoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import axa.eurekaservice.axa_producer.axaentity.EmployeeProducer;


@RestController
public class EmployeeController {
	
	
	@GetMapping("axa/employees")
	//@HystrixCommand("getSampleFallBack()")
	public List<EmployeeProducer> getEmployees()
	{
		List<EmployeeProducer> list=new ArrayList<EmployeeProducer>();
		list.add(new EmployeeProducer(1,"A"));
		return list;
	}
	
	private List<EmployeeProducer> getSampleFallBack()
	{
		List<EmployeeProducer> list=new ArrayList<EmployeeProducer>();
		list.add(new EmployeeProducer(0,""));
		return list;
	}

}
