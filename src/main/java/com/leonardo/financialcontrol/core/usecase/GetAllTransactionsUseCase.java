package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetAllTransactionsUseCase implements GetAllCommand<Transaction> {
  private final TransactionGateway gateway;

  @Override
  public List<Transaction> execute() {
    return gateway.findAll();
  }
}
