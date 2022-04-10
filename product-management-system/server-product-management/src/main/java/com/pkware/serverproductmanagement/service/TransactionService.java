package com.pkware.serverproductmanagement.service;

import java.util.List;

import com.pkware.serverproductmanagement.model.Transaction;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);

    Long numberOfTransactions();

    List<Transaction> findAllTransactions();
}
