package com.example.pismoBank.advice;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;

import com.example.pismoBank.exception.AccountNotFoundException;

@ControllerAdvice
public class AccountNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(AccountNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	 public ResponseEntity<Problem> handleAccountNotFoundException( AccountNotFoundException ex) {
	    return ResponseEntity.of(
	      Optional.of(
	        Problem.builder()
	          .withTitle(Status.NOT_FOUND.getReasonPhrase())
	          .withTitle("Account not Found")
	          .withDetail(ex.getMessage())
	          .withStatus(Status.NOT_FOUND)
	          .build()
	      ));
	  }

}
