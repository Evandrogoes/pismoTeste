package com.example.pismoBank.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountResponse {

	@JsonProperty("account_id")
	int accountId;
	@JsonProperty("document_number")
	private String documentNumber;

	public AccountResponse() {
	}

	public AccountResponse(int accountId, String documentNumber) {
		super();
		this.accountId = accountId;
		this.documentNumber = documentNumber;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

}
