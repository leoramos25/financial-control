package com.leonardo.financialcontrol.infra.configuration;

import com.leonardo.financialcontrol.core.usecase.CreateIncomeTransactionUseCase;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import com.leonardo.financialcontrol.infra.data.SpringDataJpaTransactionRepository;
import com.leonardo.financialcontrol.infra.data.TransactionRepositoryImpl;
import com.leonardo.financialcontrol.infra.delegate.TransactionDelegateImpl;
import com.leonardo.financialcontrol.interfaceadapter.delegate.TransactionDelegate;
import com.leonardo.financialcontrol.interfaceadapter.gateway.TransactionGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@EntityScan("com.leonardo.financialcontrol.interfaceadapter.repository.model")
public class ApplicationConfiguration {
    private final SpringDataJpaTransactionRepository transactionRepository;

    @Bean
    public TransactionDelegate transactionDelegate() {
        final TransactionGateway gateway = new TransactionGatewayImpl(
                new TransactionRepositoryImpl(transactionRepository));

        return new TransactionDelegateImpl(new CreateIncomeTransactionUseCase(gateway));
    }
}
