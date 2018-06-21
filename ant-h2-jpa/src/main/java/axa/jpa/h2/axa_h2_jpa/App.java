package axa.jpa.h2.axa_h2_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * Hello world!
 *
 */
@EnableJpaRepositories
@SpringBootApplication
public class App 
{
	
    public static void main( String[] args )
    {
    	System.out.println("main apap");

        MultiValueMap<String, String> params =new LinkedMultiValueMap<String, String>();
        params.add("key1", "value1");
        params.add("key1", "value1");
        params.add("key2", "value2");
        params.values().stream().map(q->
        		
        		{
        	System.out.println(q.get(0));
			return q;
        		}
        		
        		);
        params.forEach((k,v)->
        
        {
       	 System.out.println(k+"assssssssssss"+v);
        }
       		 );
        
        
     SpringApplication.run(App.class, args);
     
     
     
     
     
    }
}
