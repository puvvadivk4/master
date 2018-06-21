package axa.swagger.AXA_Swagger.otherController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherControllers {

	@GetMapping("axa/other/swagger")
	public String SwaggerTest()
	{
		return "swaggert other test";
	}
}
