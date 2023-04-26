package com.moohee.trans.dto;

public class TicketDto {
	
	private String consumerid;
	private String countnum;
	
	public TicketDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TicketDto(String consumerid, String countnum) {
		super();
		this.consumerid = consumerid;
		this.countnum = countnum;
	}
	
	public String getConsumerid() {
		return consumerid;
	}
	
	public void setConsumerid(String consumerid) {
		this.consumerid = consumerid;
	}
	
	public String getCountnum() {
		return countnum;
	}
	
	public void setCountnum(String countnum) {
		this.countnum = countnum;
	}
	
}
