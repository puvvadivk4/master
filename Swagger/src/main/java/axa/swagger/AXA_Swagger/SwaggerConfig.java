package axa.swagger.AXA_Swagger;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;








import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

//	@Bean
//	public Docket docketBean() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
//				.apiInfo(apiInfo()).select().paths(PathSelectors.any()).build();
//	}
//
//	
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("Swagger API").description("swagger for developers").version("1.0").build();
//	}
	
	
	@Bean
	public Docket bean_name() {
		 return new Docket(DocumentationType.SWAGGER_2)
         .select()                                  
         .apis(RequestHandlerSelectors.basePackage("axa.swagger.AXA_Swagger.axa_controller"))     
         .paths(PathSelectors.regex("/axa.*"))                          
         .build().apiInfo(apiInfo());
	}
	 
	private ApiInfo apiInfo() {
	   return new ApiInfoBuilder().title("Custom ApiInfo Title is AXA").description("Desc as AXA") .version("1.0").licenseUrl("www.axa.licenseUrl").build();
	}
}
