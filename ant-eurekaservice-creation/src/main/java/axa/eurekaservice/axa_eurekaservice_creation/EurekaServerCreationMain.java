package axa.eurekaservice.axa_eurekaservice_creation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication

public class EurekaServerCreationMain 
{
	
	
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerCreationMain.class, args);
       
             
    }
    
    
}
