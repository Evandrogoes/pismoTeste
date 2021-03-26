package com.example.pismoBank.exception;

public class AccountNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(Integer id) {

		super("Não foi possivel localizar a conta " + id);
		
	}

}
