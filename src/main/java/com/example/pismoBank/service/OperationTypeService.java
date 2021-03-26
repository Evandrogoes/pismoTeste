package com.example.pismoBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pismoBank.exception.OperationTypeNotFoundException;
import com.example.pismoBank.model.OperationType;
import com.example.pismoBank.repository.OperationTypeRepository;

@Service
public class OperationTypeService {

	@Autowired
	private OperationTypeRepository operationTypeRpository;

	public OperationType getOperationTypeById(Integer id) throws OperationTypeNotFoundException {		
		return operationTypeRpository.findById(id).orElseThrow(() -> new OperationTypeNotFoundException (id));
	}

}
