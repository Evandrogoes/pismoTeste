package com.example.pismoBank.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionResponse {

	@JsonProperty("transaction_id")
	private Integer id;
	@JsonProperty("account_id")
	private Integer accountId;
	@JsonProperty("operation_type_id")
	private Integer operationTypeId;
	@JsonProperty("amount")
	private Double amount;
	@JsonProperty("event_date")
	private Timestamp eventDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}		
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Timestamp getEventDate() {
		return eventDate;
	}
	public void setEventDate(Timestamp eventDate) {
		this.eventDate = eventDate;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getOperationTypeId() {
		return operationTypeId;
	}
	public void setOperationTypeId(Integer operationTypeId) {
		this.operationTypeId = operationTypeId;
	}

}
