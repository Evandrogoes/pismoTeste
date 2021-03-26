package com.example.pismoBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pismoBank.model.OperationType;

@Repository
public interface  OperationTypeRepository extends JpaRepository<OperationType, Integer> {
	

}
