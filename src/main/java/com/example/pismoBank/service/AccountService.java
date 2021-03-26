package com.example.pismoBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pismoBank.dto.AccountRequest;
import com.example.pismoBank.dto.AccountResponse;
import com.example.pismoBank.exception.AccountNotFoundException;
import com.example.pismoBank.model.Account;
import com.example.pismoBank.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account getAccountById(Integer accountId) {
		return accountRepository.findById(accountId).orElseThrow(() -> new AccountNotFoundException(accountId));
	}

	public AccountResponse createAccount(AccountRequest accountRequest) {
		Account account = convertAccountRequestoToAccount(accountRequest);
		saveAccount(account);
		AccountResponse response = convertAccountToAccountResponse(account);
		return response;
	}

	public Account convertAccountRequestoToAccount(AccountRequest accountRequest) {
		Account account = new Account();
		account.setDocumentNumber(accountRequest.getDocumentNumber());
		return account;

	}

	public AccountResponse convertAccountToAccountResponse(Account account) {
		AccountResponse accountResponse = new AccountResponse();
		accountResponse.setAccountId(account.getId());
		accountResponse.setDocumentNumber(account.getDocumentNumber());

		return accountResponse;

	}

	public void saveAccount(Account account) {
		accountRepository.save(account);
	}

}
