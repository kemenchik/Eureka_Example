package com.in28minutes.springboot.microservice.example.forex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ForexController {


    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        ExchangeValue exchangeValue = new ExchangeValue(1L, from, to, new BigDecimal(1122));

        exchangeValue.setPort(1234);

        return exchangeValue;
    }
}