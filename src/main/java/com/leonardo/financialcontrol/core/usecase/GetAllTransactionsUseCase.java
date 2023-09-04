package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetAllTransactionsUseCase implements GetAllTransactions {
    private final TransactionGateway gateway;

    @Override
    public List<Transaction> execute() {
        return gateway.findAll();
    }
}
