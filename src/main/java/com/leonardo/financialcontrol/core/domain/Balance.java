package com.leonardo.financialcontrol.core.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class Balance implements Serializable {
    @Serial
    private static final long serialVersionUID = 7313380308942679356L;
    private List<Transaction> transactions;
    private BigDecimal balance;
}
