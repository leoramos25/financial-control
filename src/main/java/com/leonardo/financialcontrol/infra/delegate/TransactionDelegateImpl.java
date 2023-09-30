package com.leonardo.financialcontrol.infra.delegate;

import static com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper.dataToDomain;
import static com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper.domainToResponse;

import com.leonardo.financialcontrol.core.domain.Balance;
import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.usecase.GetAllCommand;
import com.leonardo.financialcontrol.core.usecase.GetCommand;
import com.leonardo.financialcontrol.core.usecase.InsertCommand;
import com.leonardo.financialcontrol.interfaceadapter.delegate.TransactionDelegate;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.BalanceResponse;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionRequestData;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionResponse;
import com.leonardo.financialcontrol.interfaceadapter.mapper.BalanceMapper;
import com.leonardo.financialcontrol.interfaceadapter.mapper.TransactionModelMapper;
import java.util.List;
import java.util.Objects;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransactionDelegateImpl implements TransactionDelegate {
  private final InsertCommand<Transaction> createTransaction;
  private final GetAllCommand<Transaction> getAllTransactions;
  private final GetCommand<Balance> getBalance;

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

  @Override
  public BalanceResponse getBalance() {
    return BalanceMapper.domainToResponse(getBalance.execute());
  }
}
