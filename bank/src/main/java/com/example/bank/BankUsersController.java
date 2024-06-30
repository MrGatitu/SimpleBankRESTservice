package com.example.bank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class BankUsersController {

    BankUsers newCustomer = 
    new BankUsers("c1", "Gatitu", 50000.0);

    @GetMapping("{id}")

    public BankUsers getBankUsers(@PathVariable("id") String id) {
        return newCustomer;
    }


}
