package com.leonardo.financialcontrol.core.domain;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Balance implements Serializable {
  @Serial
  private static final long serialVersionUID = 7313380308942679356L;
  private List<Transaction> transactions;
  private BigDecimal balance;
}
