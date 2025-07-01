package com.springboot.learning.demoapp.payment;

public final record PayPal(String emailAddress) implements PaymentMethod {

}
