package com.example.pismoBank.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.pismoBank.dto.AccountRequest;
import com.example.pismoBank.dto.AccountResponse;
import com.example.pismoBank.model.Account;

class AccountServiceTest {

	AccountService accountService;
	
	@Test
	void testeConverterAccountRequestoParaAccount() {
		
		String documentAccount = "04833248506";
		
		AccountRequest accountRequest = new AccountRequest();
		accountRequest.setDocumentNumber(documentAccount);
		Account account = accountService.convertAccountRequestoToAccount(accountRequest);
		
		assertTrue(documentAccount.equals(account.getDocumentNumber()));
	}
	
	
	@Test
	void testeConverterAccountParaAccountResponse() {
		
		String documentAccount = "45977845963";	
		
		Account account = new Account();
		account.setDocumentNumber(documentAccount);
		
		AccountResponse accountResponse = new AccountResponse();
		accountResponse.setDocumentNumber(documentAccount);
		
		assertTrue(documentAccount.equals(accountResponse.getDocumentNumber()));
		
	}

}
