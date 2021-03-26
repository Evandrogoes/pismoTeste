package com.example.pismoBank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name = "account_id") 	
	private Integer id;
	@Column(name = "document_numeber")	
	private String documentNumber;	
	
	public Account() {
	};
	
	public Account(Long id, String documentNumber) {	
		super();		
		this.documentNumber = documentNumber;
	}
	
	public Account(String documentNumber) {
		super();
		this.documentNumber = documentNumber;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
