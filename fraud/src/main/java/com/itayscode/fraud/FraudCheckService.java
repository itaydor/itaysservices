package com.itayscode.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository repository;

    public boolean isFraudsterCustomer(Integer customerID){
        repository.save(
                FraudCheckHistory.builder()
                        .customerID(customerID)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build());
        return false;
    }
}
