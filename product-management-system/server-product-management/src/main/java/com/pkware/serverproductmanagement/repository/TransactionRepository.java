package com.pkware.serverproductmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pkware.serverproductmanagement.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
