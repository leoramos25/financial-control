package com.leonardo.financialcontrol.infra.delegate;

import com.leonardo.financialcontrol.core.usecase.CreateIncomeTransaction;
import com.leonardo.financialcontrol.interfaceadapter.delegate.TransactionDelegate;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionRequestData;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import static com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper.dataToDomain;
import static com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper.domainToResponse;

@RequiredArgsConstructor
public class TransactionDelegateImpl implements TransactionDelegate {
    private final CreateIncomeTransaction createIncomeTransaction;

    @Override
    public TransactionResponse create(final @NonNull TransactionRequestData transaction) {
        return domainToResponse(createIncomeTransaction.execute(dataToDomain(transaction)));
    }
}
