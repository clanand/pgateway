package com.service.gateway.pgateways;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	    
	 @RequestMapping("/validate")
	    public PGatewayResponse validateCustomer(@RequestParam(value="accountId", defaultValue="XYZ") String name) {
	        return new PGatewayResponse();
	    }
	 
	 @RequestMapping("/payment")
	    public PGatewayResponse payService(PGatewayRequest request) {
		 
		 	System.out.println( String.format(template, ""));
		 	
	        return new PGatewayResponse();
	    }
}
