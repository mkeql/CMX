package com.au.eql.cmx.premise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication(scanBasePackages = {"com.au.eql.cmx"})
public class PremiseApp {
	  public static void main(String[] args) {
		  SpringApplication.run(PremiseApp.class, args);
			
		}
	  @Bean
	    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder.build();
	    }

}
