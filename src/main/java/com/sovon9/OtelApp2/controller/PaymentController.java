package com.sovon9.OtelApp2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    Logger LOGGER = LoggerFactory.getLogger(PaymentController.class);

    @GetMapping("/payment/amount/{amount}")
    public boolean doPayment(@PathVariable("amount") double amount)
    {
        try
        {
            Thread.sleep(5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
            return false;
        }
        LOGGER.info("Payment sucessfully processed for{}", amount);
        return true;
    }
}
