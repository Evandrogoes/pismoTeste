package com.example.pismoBank.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pismoBank.dto.AccountRequest;
import com.example.pismoBank.dto.AccountResponse;
import com.example.pismoBank.model.Account;
import com.example.pismoBank.service.AccountService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Contas", tags = "Contas")
public class AccountController {

	private Logger logger = LoggerFactory.getLogger(TransactionController.class);
	@Autowired
	private AccountService accountService;

	@ApiOperation(value = "Consultar Conta")
	@GetMapping(value = "/accounts/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({ @ApiResponse(code = 200, message = "Sucess", response = Account.class) })
	ResponseEntity<AccountResponse> getAccount(@PathVariable Integer accountId) {
		logger.info("Executando getAccount path /accounts/{accountId}");
		Account account = accountService.getAccountById(accountId);
		AccountResponse accountResponse = accountService.convertAccountToAccountResponse(account);
		return ResponseEntity.ok(accountResponse);
	}

	@ApiOperation(value = "Criar Nova Conta")
	@PostMapping(value = "/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponse(code = 201, message = "Created", response = Account.class)
	ResponseEntity<AccountResponse> createAccount(@Valid @RequestBody AccountRequest accountRequest) {
		logger.info("Executando createAccount path /accounts}");
		AccountResponse accountResponse = accountService.createAccount(accountRequest);
		return ResponseEntity.ok(accountResponse);
	}

}
