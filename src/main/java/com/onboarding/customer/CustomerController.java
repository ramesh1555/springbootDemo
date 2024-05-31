package com.onboarding.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/isActive")
    public String getCustomerInfo(){
        return "Customer is active";
    }
}
