package axa.eurekaservice.axa_consumer.axacontroller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


public class ConsumerControllerClient {
	@Autowired
	//private DiscoveryClient discoveryClient;
	private LoadBalancerClient loadBalancer;
	public void getemployees() throws RestClientException,IOException
	{
		//List<ServiceInstance> instances=discoveryClient.getInstances("services-producer");
		ServiceInstance instances=loadBalancer.choose("services-producer");
		ServiceInstance serviceInstance=instances;
		
		RestTemplate restTemplate=new RestTemplate();
		System.out.println("controller start--->"+serviceInstance.getUri().toString());
		String baseUrl = serviceInstance.getUri().toString()+"/axa/employees";//"http://localhost:8080/axa/employees";
		ResponseEntity<String> response=null;
		try{
		response=restTemplate.exchange(baseUrl,
				HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println(response.getBody());
		
	}

	private HttpEntity<?> getHeaders() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<Object>(headers);
		
	}

}
