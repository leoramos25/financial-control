package com.leonardo.financialcontrol.interfaceadapter.delegate.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
public record TransactionResponse(
        UUID id,
        String description,
        String type,
        BigDecimal amount
) {
}
