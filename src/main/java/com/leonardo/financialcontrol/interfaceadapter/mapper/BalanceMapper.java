package com.leonardo.financialcontrol.interfaceadapter.mapper;

import com.leonardo.financialcontrol.core.domain.Balance;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.BalanceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BalanceMapper {

    public static BalanceResponse domainToResponse(Balance balance) {
        if (balance == null) {
            return null;
        }

        return BalanceResponse.builder()
                .balance(balance.getBalance())
                .transactions(balance.getTransactions().stream().map(TransactionModelMapper::domainToResponse).toList())
                .build();
    }
}
