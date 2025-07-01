package com.springboot.learning.demoapp.payment;

// A record is a special class in Java used to define immutable data carriers with minimal boilerplate.
/**
 * This automatically generates:

A constructor

Getters (cardNumber(), expiryDate(), cvv())

equals(), hashCode(), and toString()
 * 
 */
public final record CreditCard(String cardNumber, String expiryDate, String cvv) implements PaymentMethod {

}
