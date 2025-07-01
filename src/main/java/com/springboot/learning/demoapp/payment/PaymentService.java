package com.springboot.learning.demoapp.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(PaymentMethod paymentMethod) {
        // The switch expression on the sealed type ensures all cases are handled.
        return switch (paymentMethod) {
            case CreditCard cc -> "Processing Credit Card ending in " + cc.cardNumber().substring(cc.cardNumber().length() - 4);
            case PayPal pp -> "Processing PayPal payment for " + pp.emailAddress();
            case BankTransfer bt -> "Processing Bank Transfer for account " + bt.accountNumber();
        };
    }

}
