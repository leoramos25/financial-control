package com.leonardo.financialcontrol.interfaceadapter.gateway;

import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper;
import com.leonardo.financialcontrol.interfaceadapter.repository.TransactionRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import static com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper.domainToModel;

@RequiredArgsConstructor
public class TransactionGatewayImpl implements TransactionGateway {
    private final TransactionRepository repository;

    @Override
    public Transaction save(final @NonNull Transaction transaction) {
        return TransactionModelMapper.modelToDomain(repository.save(domainToModel(transaction)));
    }
}
