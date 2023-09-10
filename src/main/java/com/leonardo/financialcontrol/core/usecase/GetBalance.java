package com.leonardo.financialcontrol.core.usecase;

import com.leonardo.financialcontrol.core.domain.Balance;
import com.leonardo.financialcontrol.core.domain.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface GetBalance {
    Balance execute();
}
