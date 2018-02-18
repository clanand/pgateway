package com.service.gateway.pgateways.bo;

public class PGatewayRequest {
	
	private String paymentGatewayID;
	private String invoiceNo;
	private String productDesc;
	private Double amount;
	private Integer currencyCode;
	private String userDefined1;
	private String userDefined2;
	private String userDefined3;
	private String userDefined4;
	private String userDefined5;
	private char Nonsecure;
	private String hashValue;
	
	public String getPaymentGatewayID() {
		return paymentGatewayID;
	}
	public void setPaymentGatewayID(String paymentGatewayID) {
		this.paymentGatewayID = paymentGatewayID;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(Integer currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getUserDefined1() {
		return userDefined1;
	}
	public void setUserDefined1(String userDefined1) {
		this.userDefined1 = userDefined1;
	}
	public String getUserDefined2() {
		return userDefined2;
	}
	public void setUserDefined2(String userDefined2) {
		this.userDefined2 = userDefined2;
	}
	public String getUserDefined3() {
		return userDefined3;
	}
	public void setUserDefined3(String userDefined3) {
		this.userDefined3 = userDefined3;
	}
	public String getUserDefined4() {
		return userDefined4;
	}
	public void setUserDefined4(String userDefined4) {
		this.userDefined4 = userDefined4;
	}
	public String getUserDefined5() {
		return userDefined5;
	}
	public void setUserDefined5(String userDefined5) {
		this.userDefined5 = userDefined5;
	}
	public char getNonsecure() {
		return Nonsecure;
	}
	public void setNonsecure(char nonsecure) {
		Nonsecure = nonsecure;
	}
	public String getHashValue() {
		return hashValue;
	}
	public void setHashValue(String hashValue) {
		this.hashValue = hashValue;
	}
	

}
