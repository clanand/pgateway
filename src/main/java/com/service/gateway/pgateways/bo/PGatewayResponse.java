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
	
	public String getPaymentGatewayID() {
		return paymentGatewayID;
	}
	public void setPaymentGatewayID(String paymentGatewayID) {
		this.paymentGatewayID = paymentGatewayID;
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getFraudCode() {
		return fraudCode;
	}
	public void setFraudCode(String fraudCode) {
		this.fraudCode = fraudCode;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getTranRef() {
		return tranRef;
	}
	public void setTranRef(String tranRef) {
		this.tranRef = tranRef;
	}
	public String getApprovalCode() {
		return approvalCode;
	}
	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}
	public int getEci() {
		return eci;
	}
	public void setEci(int eci) {
		this.eci = eci;
	}
	public Double getDateTime() {
		return dateTime;
	}
	public void setDateTime(Double dateTime) {
		this.dateTime = dateTime;
	}
}
