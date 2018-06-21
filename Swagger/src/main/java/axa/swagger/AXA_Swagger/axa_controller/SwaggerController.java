package axa.swagger.AXA_Swagger.axa_controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jdk.nashorn.internal.objects.annotations.Optimistic;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@ApiResponses(value = {
//        @ApiResponse(code = 500, message = "Server error"),
//         @ApiResponse(code = 404, message = "Service not found"),
//        @ApiResponse(code = 200, message = "Successful retrieval",
//            response = SwaggerController.class, responseContainer = "List") })
//@ApiResponses(value={@ApiResponse(code = 500, message = "Server error"), @ApiResponse(code = 404, message = "Service not found"),@ApiResponse(code = 200, message = "Successful retrieval")})
@RestController
public class SwaggerController {

	@ApiResponses(value={@ApiResponse(code = 500, message = "Server error"), @ApiResponse(code = 404, message = "Service not found"),@ApiResponse(code = 200, message = "Successful retrieval")})
	@GetMapping("axa/swagger")
	public String SwaggerTest()
	{
		return "swagger rest";
	}
	@GetMapping("axa/swaggerpath1")
	public String SwaggerTest1()
	{
		return "swagger rest";
	}
	@GetMapping("axa/swaggerpath2")
	public String SwaggerTest2()
	{
		return "swagger rest";
	}
	@GetMapping("swagger/axa")
	public String SwaggerTest3()
	{
		return "swagger rest";
	}
	@GetMapping("swagger/axa1")
	public String SwaggerTest4()
	{
		return "swagger rest";
	}
	
//	@GetMapping("/error")
//	public String error()
//	{
//		return "swagger get error";
//	}
//	@DeleteMapping("/error")
//	public String errorDel()
//	{
//		return "swagger get error";
//	}
//	
//	@PostMapping("/error")
//	public String errorPost()
//	{
//		return "swagger get error";
//	}
//	@PutMapping("/error")
//	public String errorPut()
//	{
//		return "swagger get error";
//	}
//	
//	@PatchMapping("/error")
//	public String errorPatch()
//	{
//		return "swagger get error";
//	}
//	
	
	
}
