package com.leonardo.financialcontrol.interfaceadapter.delegate.dto;

import com.leonardo.financialcontrol.core.domain.enuns.TransactionType;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
public record TransactionResponse(
        UUID id,
        String description,
        TransactionType type,
        BigDecimal amount
) {
}
