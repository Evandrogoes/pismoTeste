package com.example.pismoBank.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountRequest {

	@Pattern(regexp = "^[0-9]{11}$", message = "Documento deve conter numeros de 0 a 9 e tamanho 11")
	@NotBlank(message = "Numero do Documento obrigatorio")
	@JsonProperty("document_number")
	private String documentNumber;

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

}
