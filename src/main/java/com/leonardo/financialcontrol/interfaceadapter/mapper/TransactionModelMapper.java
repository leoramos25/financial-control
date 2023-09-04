package com.leonardo.financialcontrol.interfaceadapter.mapper;

import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionRequestData;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionResponse;
import com.leonardo.financialcontrol.interfaceadapter.repository.model.TransactionModel;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TransactionModelMapper {
    public static TransactionModel domainToModel(Transaction domain) {
        if (domain == null) {
            return null;
        }
        return new TransactionModel(domain.getId(), domain.getDescription(), domain.getType(), domain.getAmount());
    }

    public static Transaction modelToDomain(TransactionModel model) {
        if (model == null) {
            return null;
        }
        return Transaction.builder()
                .id(model.getId())
                .description(model.getDescription())
                .type(model.getType())
                .amount(model.getAmount())
                .build();
    }

    public static Transaction dataToDomain(TransactionRequestData data) {
        if (data == null) {
            return null;
        }
        return Transaction.builder()
                .description(data.description())
                .amount(data.amount())
                .build();
    }

    public static TransactionResponse domainToResponse(Transaction domain) {
        if (domain == null) {
            return null;
        }
        return TransactionResponse.builder()
                .id(domain.getId())
                .description(domain.getDescription())
                .type(domain.getType())
                .amount(domain.getAmount())
                .build();
    }
}
