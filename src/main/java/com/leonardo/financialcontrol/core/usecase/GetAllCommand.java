package com.leonardo.financialcontrol.core.usecase;

import java.util.List;

public interface GetAllCommand<E> {
  List<E> execute();
}