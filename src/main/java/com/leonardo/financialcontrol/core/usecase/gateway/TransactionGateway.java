package com.leonardo.financialcontrol.core.usecase.gateway;

import com.leonardo.financialcontrol.core.domain.Transaction;
import java.util.List;

public interface TransactionGateway {
  Transaction save(Transaction transaction);
  List<Transaction> findAll();
}
