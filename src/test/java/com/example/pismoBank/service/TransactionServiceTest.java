package com.example.pismoBank.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import com.example.pismoBank.dto.TransactionResponse;
import com.example.pismoBank.model.Account;
import com.example.pismoBank.model.OperationType;
import com.example.pismoBank.model.Transaction;

class TransactionServiceTest {

	TransactionService transactionService = new TransactionService();

	@Test
	void testCalculaTransactionAmountPositivo() {

		int fatorPositivo = 1;
		Double amount = 10.00;
		Double amountExpected = fatorPositivo * amount;

		Double amountCalculado = transactionService.calculaTransactionAmount(fatorPositivo, amount);
		
		assertEquals(amountExpected,amountCalculado);
	}

	@Test
	void testCalculaTransactionAmountNegativo() {

		int fatorPositivo = -1;
		Double amount = 10.00;
		Double amountExpected = amount * fatorPositivo;

		Double amountCalculado = transactionService.calculaTransactionAmount(fatorPositivo, amount);

		assertEquals(amountExpected,amountCalculado);

	}

	@Test
	void testarConversaoTransactionParaTransactionResponse() {
		Timestamp eventDate = new Timestamp(System.currentTimeMillis());
		Double amout = new Double(10);
		
		Account account = new Account();		
		account.setId(3);

		OperationType operationType = new OperationType();
		operationType.setId(4);

		Transaction transaction = new Transaction();
		transaction.setAccount(account);
		transaction.setOperationType(operationType);
		transaction.setEventDate(eventDate);
		transaction.setAmount(amout);

		TransactionResponse transactionResponse = transactionService.converterTransactionParaTransactionResponse(transaction);

		assertEquals(eventDate, transactionResponse.getEventDate());
		assertEquals(account.getId(), transactionResponse.getAccountId());
		assertEquals(operationType.getId(), transactionResponse.getOperationTypeId());
		assertEquals(amout, transactionResponse.getAmount());

	}
	
	@Test
	void testarGeracaoTransaction() {
		
		String documentNumber = "04833248506";
		Double amount = new Double(14);
		
		OperationType operationType = new OperationType();
		operationType.setId(4);
		operationType.setFatorTransaction(1);
		
		Account account = new Account();
		account.setDocumentNumber(documentNumber);
		account.setId(99);
		
		Transaction transaction = transactionService.gerarTransaction(operationType, account, amount);
	
		assertEquals(account.getId(), transaction.getAccount().getId());
		assertEquals(operationType.getId(), transaction.getOperationType().getId());
		assertEquals(transaction.getAmount(), amount);
			
		
		
	}

}
