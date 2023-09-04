package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.domain.enuns.TransactionType;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateIncomeTransactionUseCase implements CreateIncomeTransaction {
    private final TransactionGateway gateway;

    @Override
    public Transaction execute(final @NonNull Transaction transaction) {
        transaction.setType(TransactionType.INCOME);
        return gateway.save(transaction);
    }
}
