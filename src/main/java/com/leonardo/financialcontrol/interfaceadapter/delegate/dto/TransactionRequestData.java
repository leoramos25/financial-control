package com.leonardo.financialcontrol.interfaceadapter.delegate.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Builder;

@Builder
public record TransactionRequestData(
    String description,
    @NotNull(message = "amount can not be null")
    BigDecimal amount,
    @NotBlank(message = "type can not be empty")
    String type
) {

}
