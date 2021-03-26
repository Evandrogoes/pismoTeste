package com.example.pismoBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pismoBank.model.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
