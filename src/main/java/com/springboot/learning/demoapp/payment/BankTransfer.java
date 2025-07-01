package com.springboot.learning.demoapp.payment;

public final record BankTransfer(String accountNumber, String routingNumber) implements PaymentMethod{

}
