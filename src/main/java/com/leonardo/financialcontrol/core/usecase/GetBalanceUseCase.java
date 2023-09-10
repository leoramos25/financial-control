package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Balance;
import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.domain.enuns.TransactionType;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
public class GetBalanceUseCase implements GetBalance {
    private final TransactionGateway transactionGateway;

    @Override
    public Balance execute() {
        final List<Transaction> transactions = transactionGateway.findAll();
        return Balance.builder()
                .transactions(transactions)
                .balance(transactions.stream()
                        .map(transaction -> transaction.getType() == TransactionType.OUTCOME ? transaction.getAmount().negate()
                                : transaction.getAmount())
                        .reduce(BigDecimal.ZERO, BigDecimal::add))
                .build();
    }
}
