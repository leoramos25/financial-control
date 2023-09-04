package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Transaction;

public interface CreateIncomeTransaction {
    Transaction execute(Transaction transaction);
}
