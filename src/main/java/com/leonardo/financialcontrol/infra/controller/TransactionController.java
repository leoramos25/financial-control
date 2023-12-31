package com.leonardo.financialcontrol.infra.controller;

import com.leonardo.financialcontrol.interfaceadapter.delegate.TransactionDelegate;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.BalanceResponse;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionRequestData;
import com.leonardo.financialcontrol.interfaceadapter.delegate.dto.TransactionResponse;
import java.net.URI;
import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transactions")
public class TransactionController {
  private final TransactionDelegate delegate;

  @PostMapping
  public ResponseEntity<TransactionResponse> createTransaction(
      final @NonNull @RequestBody TransactionRequestData transaction) {
    final TransactionResponse response = delegate.createTransaction(transaction);
    final URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(response.id()).toUri();
    return ResponseEntity.created(uri).body(response);
  }

  @GetMapping
  public ResponseEntity<List<TransactionResponse>> getAllTransactions() {
    return ResponseEntity.ok(delegate.getAllTransactions());
  }

  @GetMapping("/balance")
  public ResponseEntity<BalanceResponse> getBalance() {
    return ResponseEntity.ok(delegate.getBalance());
  }
}
