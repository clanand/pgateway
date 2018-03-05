package com.service.gateway.pgateways;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.gateway.pgateways.bo.PGatewayRequest;
import com.service.gateway.pgateways.bo.PGatewayResponse;

/**
 * Hello world!
 *
 */
@RestController
public class PServiceGatewayController 
{
	 private static final String template = "Hello, %s!";
	 private final AtomicLong counter = new AtomicLong();
	 
	 @Autowired
	 RestTemplate restTemplate;
	 
	 PGatewayRequest pGatewayRequest;
	 PGatewayResponse pGatewayResponse;
	 
	 @Value("${operations.restURL}")
	 String serviceURL;
	      
	 @RequestMapping("/validate")
	    public PGatewayResponse validateCustomer(@RequestParam(value="accountId", defaultValue="XYZ") String name) {
	        return new PGatewayResponse();
	    }
	 
	 @RequestMapping("/payment")
	    public String payService(PGatewayRequest request) {
		 
		 ResponseEntity  <String> response = restTemplate.postForEntity(serviceURL, pGatewayRequest,
					String.class);
			 
		 
		 	System.out.println( String.format(template, ""));
		 	
	        return response.getBody();
	    }
	 
	 @Bean
	 public RestTemplate restTemplate() {
	     return new RestTemplate();
	 }
}
