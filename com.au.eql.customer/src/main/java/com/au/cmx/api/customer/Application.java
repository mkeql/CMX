package com.au.cmx.api.customer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.au.cmx.api.customer")
public class Application {
	

	public static void main(String[] args) {
		
 new SpringApplicationBuilder(Application.class)
		.build()	
		.run(args);
		
	}

}
