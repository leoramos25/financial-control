package com.leonardo.financialcontrol.core.domain.enuns;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TransactionType {
  INCOME("INCOME"),
  OUTCOME("OUTCOME");

  private final String description;
}
