package com.leonardo.financialcontrol;

import com.leonardo.financialcontrol.core.domain.Transaction;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TransactionUtils {

    public static Transaction createIncomeTransaction() {
        return Transaction.builder()
                .id(UUID.randomUUID())
                .description("Week salary")
                .amount(BigDecimal.valueOf(700.00))
                .build();
    }
}
