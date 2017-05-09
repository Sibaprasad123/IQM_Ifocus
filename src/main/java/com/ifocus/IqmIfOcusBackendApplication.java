package com.ifocus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IqmIfOcusBackendApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(IqmIfOcusBackendApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(IqmIfOcusBackendApplication.class, args);
	}
	
	//Endpoint for testing spring boot
	//TODO:it Can be remove later.
	@RequestMapping(value="/")
	public String testBoot(){
		return "!!.....Welcome to IQM Tool...!!";
		
	}

}
