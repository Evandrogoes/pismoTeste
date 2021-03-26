package com.example.pismoBank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pismoBank.dto.TransactionRequest;
import com.example.pismoBank.dto.TransactionResponse;
import com.example.pismoBank.service.TransactionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Transações", tags = "Transações")
public class TransactionController {

	private Logger logger = LoggerFactory.getLogger(TransactionController.class);
	@Autowired
	private TransactionService transactionService;

	@ApiOperation(value = "Criar transação ")	
	@PostMapping(value = "/transactions", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
	ResponseEntity<TransactionResponse>  createTransaction(@RequestBody TransactionRequest transactionRequest) {
		logger.info("Executando createTransaction path /transactions");
		TransactionResponse transactionResponse = transactionService.cadastrarTransaction(transactionRequest);	
		return ResponseEntity.ok(transactionResponse);
	}

}
