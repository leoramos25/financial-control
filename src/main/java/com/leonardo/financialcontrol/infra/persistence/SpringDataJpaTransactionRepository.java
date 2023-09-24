package com.leonardo.financialcontrol.infra.persistence;

import com.leonardo.financialcontrol.interfaceadapter.repository.model.TransactionModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaTransactionRepository extends JpaRepository<TransactionModel, UUID> {
}
