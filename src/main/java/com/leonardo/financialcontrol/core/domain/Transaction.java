package com.leonardo.financialcontrol.core.domain;

import com.leonardo.financialcontrol.core.domain.enuns.TransactionType;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

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
