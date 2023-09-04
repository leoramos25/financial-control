package com.leonardo.financialcontrol.interfaceadapter.delegate;

import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionRequestData;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionResponse;

public interface TransactionDelegate {
    TransactionResponse create(TransactionRequestData transaction);
}
