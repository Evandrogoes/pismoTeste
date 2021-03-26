package com.example.pismoBank.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private Integer id;

	@OneToOne
	@JoinColumn(name = "account_id", referencedColumnName = "account_id")
	@JsonProperty("account_id")
	@ApiModelProperty(name = "Account TESTE")
	private Account account;
	@OneToOne
	@JoinColumn(name = "operationType_id", referencedColumnName = "operationType_id")
	@JsonProperty("operation_type_id")
	private OperationType operationType;
	@Column(name = "amount")
	@JsonProperty("amount")
	private Double amount;
	@Column(name = "event_date")
	@CreationTimestamp	
	private Timestamp eventDate;

	public Transaction() {
	}

	public Transaction(Integer id, Account account, OperationType operationType, Double amount, Timestamp eventDate) {
		super();
		this.id = id;
		this.account = account;
		this.operationType = operationType;
		this.amount = amount;
		this.eventDate = eventDate;
	}

	public Transaction(Account account, OperationType operationType, Double amount, Timestamp eventDate) {
		super();
		this.account = account;
		this.operationType = operationType;
		this.amount = amount;
		this.eventDate = eventDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public OperationType getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
