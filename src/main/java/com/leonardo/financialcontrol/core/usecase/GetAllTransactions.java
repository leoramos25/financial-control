package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Transaction;

import java.util.List;

public interface GetAllTransactions {
    List<Transaction> execute();
}
