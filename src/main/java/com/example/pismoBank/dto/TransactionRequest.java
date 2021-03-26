package com.example.pismoBank.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TransactionRequest {
	
	@JsonProperty("account_id")
	private Integer accountId;
	@JsonProperty("operation_type_id")
	private Integer operationTypeId;
	@JsonProperty("amount")
	private Double amount;
	
	public TransactionRequest() {
		
	}
	
	public TransactionRequest(Integer accountId, Integer operationTypeId, Double amount) {
		super();
		this.accountId = accountId;
		this.operationTypeId = operationTypeId;
		this.amount = amount;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	

}
