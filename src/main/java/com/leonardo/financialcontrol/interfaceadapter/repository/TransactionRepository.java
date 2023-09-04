package com.leonardo.financialcontrol.interfaceadapter.repository;

import com.leonardo.financialcontrol.interfaceadapter.repository.model.TransactionModel;

public interface TransactionRepository {
    TransactionModel save(TransactionModel transaction);
}
