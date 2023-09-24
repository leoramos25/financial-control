package com.leonardo.financialcontrol.interfaceadapter.repository;

import com.leonardo.financialcontrol.interfaceadapter.repository.model.TransactionModel;
import java.util.List;

public interface TransactionRepository {
  TransactionModel save(TransactionModel transaction);
  List<TransactionModel> findAll();
}
