package com.leonardo.financialcontrol.core.domain;

import com.leonardo.financialcontrol.core.domain.enuns.TransactionType;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
public class Transaction implements Serializable {
    @Serial
    private static final long serialVersionUID = -542210245499939362L;
    private UUID id;
    private String description;
    private TransactionType type;
    private BigDecimal amount;
}
