package axa.eurekaservice.axa_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Hello world!
 *
 */
//ADDED AFTER EUREKA SERVICE CREATED
//NOW IT IS TREATED AS A CLIENT

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerMainn 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProducerMainn.class, args);
    }
}
