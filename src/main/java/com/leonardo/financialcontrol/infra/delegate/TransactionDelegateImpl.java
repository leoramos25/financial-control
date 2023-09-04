package com.leonardo.financialcontrol.infra.delegate;

import com.leonardo.financialcontrol.core.usecase.CreateTransaction;
import com.leonardo.financialcontrol.core.usecase.GetAllTransactions;
import com.leonardo.financialcontrol.interfaceadapter.delegate.TransactionDelegate;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionRequestData;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionResponse;
import com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;

import static com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper.dataToDomain;
import static com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper.domainToResponse;

@RequiredArgsConstructor
public class TransactionDelegateImpl implements TransactionDelegate {
    private final CreateTransaction createTransaction;
    private final GetAllTransactions getAllTransactions;

    @Override
    public TransactionResponse createTransaction(final @NonNull TransactionRequestData transaction) {
        return domainToResponse(createTransaction.execute(dataToDomain(transaction)));
    }

    @Override
    public List<TransactionResponse> getAllTransactions() {
        return getAllTransactions.execute().stream().filter(Objects::nonNull)
                .map(TransactionModelMapper::domainToResponse)
                .toList();
    }
}
