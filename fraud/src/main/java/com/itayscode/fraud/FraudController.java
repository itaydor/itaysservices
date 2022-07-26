package com.itayscode.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerID}")
    public FraudCheckResponse isFraudster(@PathVariable("customerID") Integer customerID){
        return new FraudCheckResponse(fraudCheckService.isFraudsterCustomer(customerID));
    }
}
