package com.leonardo.financialcontrol.interfaceadapter.delegate.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record TransactionRequestData(
        String description,
        BigDecimal amount,
        String type
) {
}
