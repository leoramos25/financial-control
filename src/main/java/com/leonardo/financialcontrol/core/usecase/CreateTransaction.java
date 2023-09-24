package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Transaction;

public interface CreateTransaction {
  Transaction execute(Transaction transaction);
}
