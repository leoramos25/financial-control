package com.leonardo.financialcontrol.interfaceadapter.gateway;

import static com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper.domainToModel;

import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper;
import com.leonardo.financialcontrol.interfaceadapter.repository.TransactionRepository;
import java.util.List;
import java.util.Objects;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransactionGatewayImpl implements TransactionGateway {
  private final TransactionRepository repository;

  @Override
  public Transaction save(final @NonNull Transaction transaction) {
    return TransactionModelMapper.modelToDomain(repository.save(domainToModel(transaction)));
  }

  @Override
  public List<Transaction> findAll() {
    return repository.findAll().stream()
        .filter(Objects::nonNull)
        .map(TransactionModelMapper::modelToDomain)
        .toList();
  }
}
