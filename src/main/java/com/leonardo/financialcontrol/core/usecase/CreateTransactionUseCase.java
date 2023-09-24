package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTransactionUseCase implements InsertCommand<Transaction> {
  private final TransactionGateway gateway;

  @Override
  public Transaction execute(final @NonNull Transaction transaction) {
    return gateway.save(transaction);
  }
}
