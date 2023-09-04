package com.leonardo.financialcontrol.core.usecase.gateway;

import com.leonardo.financialcontrol.core.domain.Transaction;

public interface TransactionGateway {
    Transaction save(Transaction transaction);
}
