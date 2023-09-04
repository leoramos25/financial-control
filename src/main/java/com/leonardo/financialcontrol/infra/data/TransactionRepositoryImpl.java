package com.leonardo.financialcontrol.infra.data;

import com.leonardo.financialcontrol.interfaceadapter.repository.TransactionRepository;
import com.leonardo.financialcontrol.interfaceadapter.repository.model.TransactionModel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransactionRepositoryImpl implements TransactionRepository {
    private final SpringDataJpaTransactionRepository repository;

    @Override
    public TransactionModel save(TransactionModel transaction) {
        return repository.save(transaction);
    }
}
