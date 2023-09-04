package com.leonardo.financialcontrol.interfaceadapter.repository.model;

import com.leonardo.financialcontrol.core.domain.enuns.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

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
