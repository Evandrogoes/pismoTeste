package com.example.pismoBank.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TransactionRequest {
	
	@JsonProperty("account_id")
	@NotBlank(message = "Numero da Conta obrigatorio")
	@Positive
	private Integer accountId;
	@NotBlank(message = "Tipo de Operacao obrigatorio")
	@Positive	
	@JsonProperty("operation_type_id")
	private Integer operationTypeId;
	@NotBlank(message = "Valor da transacao obrigatorio")
	@Positive (message = "Valor da transacao deve ser positiva e maior que zero")
	@JsonProperty("amount")
	@NumberFormat(pattern = "#.##")
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
