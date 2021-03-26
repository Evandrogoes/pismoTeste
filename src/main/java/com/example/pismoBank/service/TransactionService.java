package com.example.pismoBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pismoBank.dto.TransactionRequest;
import com.example.pismoBank.dto.TransactionResponse;
import com.example.pismoBank.model.Account;
import com.example.pismoBank.model.OperationType;
import com.example.pismoBank.model.Transaction;
import com.example.pismoBank.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private OperationTypeService operationTypeService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private TransactionRepository transactionRepository;

	public TransactionResponse cadastrarTransaction(TransactionRequest transactionRequest) {
		OperationType operationType = operationTypeService.getOperationTypeById(transactionRequest.getOperationTypeId());
		Account account = accountService.getAccountById(transactionRequest.getAccountId());
		
		Double transactionAmount = transactionRequest.getAmount();
		
		Transaction transaction = gerarTransaction(operationType, account, transactionAmount);		
		saveTransaction(transaction);
		
		TransactionResponse transactionResponse = converterTransactionParaTransactionResponse (transaction);
		return transactionResponse;
	}

	public TransactionResponse converterTransactionParaTransactionResponse(Transaction transaction) {
		TransactionResponse transactionResponse = new TransactionResponse();
		transactionResponse.setAccountId(transaction.getAccount().getId());
		transactionResponse.setOperationTypeId(transaction.getOperationType().getId());
		transactionResponse.setId(transaction.getId());
		transactionResponse.setEventDate(transaction.getEventDate());
		transactionResponse.setAmount(transaction.getAmount());
		return transactionResponse;
	}

	public Transaction gerarTransaction(OperationType operationType, Account account, Double amount) {
		Transaction transaction = new Transaction();
		Double amountTrasaction = calculaTransactionAmount(operationType.getFatorTransaction(), amount);
		transaction.setAccount(account);
		transaction.setOperationType(operationType);
		transaction.setAmount(amountTrasaction);
		
		return transaction;
	}

	public Double calculaTransactionAmount(int fator, Double amount) {
		return fator * amount;
	}
	
	public void saveTransaction (Transaction transaction) {
		transactionRepository.save(transaction);		
	}

}
