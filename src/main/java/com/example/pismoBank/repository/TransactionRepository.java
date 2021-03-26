package com.example.pismoBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pismoBank.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {	


}
