package axa.eurekaservice.axa_consumer;


import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import axa.eurekaservice.axa_consumer.axacontroller.ConsumerControllerClient;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class ConsumerMain 
{
    public static void main( String[] args ) throws RestClientException, IOException
    {
    	try{
      ApplicationContext applicationContext=SpringApplication.run(ConsumerMain.class, args);
      
      ConsumerControllerClient consumerControllerClient=applicationContext.getBean(ConsumerControllerClient.class);
		System.out.println("main============");
      System.out.println(consumerControllerClient);
		consumerControllerClient.getemployees();
    	}
    	catch(Exception exp)
    	{
    		System.out.println(exp.getMessage());
    	}
    }
    @Bean
	public  ConsumerControllerClient  consumerControllerClient()
	{
		return  new ConsumerControllerClient();
	}
}
