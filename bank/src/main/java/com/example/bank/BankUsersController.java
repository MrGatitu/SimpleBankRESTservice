package com.example.bank;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class BankUsersController {

    BankUsers BankUsers;

    /*BankUsers newCustomer = 
    new BankUsers("c1", "Gatitu", 50000.0);

    @GetMapping("{id}")

    public BankUsers getBankUsers(@PathVariable("id") String id) {
        return newCustomer;
    }*/

    @GetMapping("{id}")

    public BankUsers getBankUserssBankUsers(@PathVariable("id") String id) {
        return new BankUsers("c2", "John",25000.0);
    }

    @PostMapping
    public String CreateUser(@RequestBody BankUsers BankUsers){
        this.BankUsers = BankUsers;
        return "Created Successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody BankUsers BankUsers){
        this.BankUsers = BankUsers;
        return "Updated Successfully";
    }



    @DeleteMapping("{id}")
    public String DeleteUser(@PathVariable("id") String id){
        return "Deleted Successfully";
    }



}
