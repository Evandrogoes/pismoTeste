package com.example.pismoBank.exception;

public class OperationTypeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1435921229072089016L;
	
	public OperationTypeNotFoundException(Integer id) {

		super("Não foi possivel localizar o tipo de operação " + id);
		
	}
	
	

}
