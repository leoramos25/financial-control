package com.leonardo.financialcontrol.interfaceadapter.delegate;

import com.leonardo.financialcontrol.core.domain.Balance;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.BalanceResponse;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionRequestData;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionResponse;

import java.math.BigDecimal;
import java.util.List;

public interface TransactionDelegate {
    TransactionResponse createTransaction(TransactionRequestData transaction);

    List<TransactionResponse> getAllTransactions();

    BalanceResponse getBalance();
}
