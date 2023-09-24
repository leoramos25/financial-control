package com.leonardo.financialcontrol.interfaceadapter.repository.model;

import com.leonardo.financialcontrol.core.domain.enuns.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "transaction")
@Table(name = "transactions")
@NoArgsConstructor
@AllArgsConstructor
public class TransactionModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  private String description;
  @Enumerated(EnumType.STRING)
  private TransactionType type;
  private BigDecimal amount;
}