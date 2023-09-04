package com.leonardo.financialcontrol.infra.data;

import com.leonardo.financialcontrol.interfaceadapter.repository.model.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataJpaTransactionRepository extends JpaRepository<TransactionModel, UUID> {
}
