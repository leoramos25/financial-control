package com.leonardo.financialcontrol.core.usecase;

public interface InsertCommand<E> {
  E execute(E entity);
}
