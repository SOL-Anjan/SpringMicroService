package com.springboot.learning.demoapp.payment;

// record type java class
public final record BankTransfer(String accountNumber, String routingNumber) implements PaymentMethod{

}
