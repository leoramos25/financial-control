package com.leonardo.financialcontrol.interfaceadapter.delegate.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record BalanceResponse(
        BigDecimal balance,
        List<TransactionResponse> transactions
) {
}
