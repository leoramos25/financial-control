package com.leonardo.financialcontrol.usecase;

import static com.leonardo.financialcontrol.TransactionUtils.createIncomeTransaction;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.leonardo.financialcontrol.core.domain.Transaction;
import com.leonardo.financialcontrol.core.domain.enuns.TransactionType;
import com.leonardo.financialcontrol.core.usecase.CreateTransactionUseCase;
import com.leonardo.financialcontrol.core.usecase.gateway.TransactionGateway;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateTransactionUseCaseTest {
  @InjectMocks
  private CreateTransactionUseCase useCase;

  @Mock
  private TransactionGateway gateway;

  @Test
  @Tag("unit")
  void execute_whenTransactionIsNull_shouldThrowException() {
    assertThatNullPointerException().isThrownBy(() -> useCase.execute(null));

    verify(gateway, never()).save(any());
  }

  @Test
  @Tag("unit")
  void execute_whenIncomeTransactionIsValid_shouldReturnTransaction() {
    final Transaction transaction = createIncomeTransaction();

    when(gateway.save(any(Transaction.class))).thenReturn(transaction);

    final Transaction response = useCase.execute(transaction);

    assertThat(response).isNotNull();
    assertThat(response.getId()).isNotNull();
    assertThat(response.getAmount()).isPositive();
    assertThat(response.getAmount()).isNotNull();
    assertThat(response.getType()).isEqualTo(TransactionType.INCOME);

    verify(gateway).save(any(Transaction.class));
  }
}
