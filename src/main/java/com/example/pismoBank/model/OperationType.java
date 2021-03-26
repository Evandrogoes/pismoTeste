package com.example.pismoBank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OperationType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "operationType_id")
	private Integer id;
	@Column(name = "description")
	private String description;
	@Column(name = "fator_transaction")
	private int fatorTransaction;

	public OperationType() {
	};

	public OperationType(Integer id, String description, int fatorTransaction) {
		super();
		this.id = id;
		this.description = description;
		this.fatorTransaction = fatorTransaction;
	}

	public OperationType(String description, int fatorTransaction) {
		super();
		this.description = description;
		this.fatorTransaction = fatorTransaction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getFatorTransaction() {
		return fatorTransaction;
	}

	public void setFatorTransaction(int fatorTransaction) {
		this.fatorTransaction = fatorTransaction;
	}

}
