package com.example.bank;

public class BankUsers {
    String id;
    String name;
    Double amount;


    public BankUsers(String id, String name, Double amount){
        this.id = id;
        this.name = name;
        this.amount =amount;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Double getAmount() {
        return amount;
    }

    
}
