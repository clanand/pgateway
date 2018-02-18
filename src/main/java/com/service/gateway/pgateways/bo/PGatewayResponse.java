package com.service.gateway.pgateways.bo;

public class PGatewayResponse {
	
	private String paymentGatewayID;
	private String respCode;  // The  code  whether  the   transaction  is   successful  or  not.  
	private String fraudCode;  // The  code  whether  the   fraud  is  passed  or  not.
	private String pan;  // Master Credit Card Number
	private Integer amount;
	private String invoiceNo;
	private String tranRef;
	private String approvalCode;
	private int eci;
	private Double dateTime;
	
	 

}
