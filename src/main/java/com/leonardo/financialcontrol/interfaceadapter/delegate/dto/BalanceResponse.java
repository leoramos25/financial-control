package com.leonardo.financialcontrol.interfaceadapter.delegate.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.List;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public record BalanceResponse(
    BigDecimal balance,
    List<TransactionResponse> transactions
) {

}
