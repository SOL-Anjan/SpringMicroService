package com.springboot.learning.demoapp.payment;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;


/**
 * Sealed interface for payment methods.
 * Jackson annotations are added to handle polymorphism based on a "type" property in the JSON.
 */

 /**
  * This code defines a polymorphic JSON structure in Java using Jackson annotations and 
  Java's sealed interfaces (introduced in Java 17) to represent different types of payment methods in a type-safe, extensible way.
  */

  // This says: "I want a property called type in my JSON to say what class this is."
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)

// This tells Jackson: "Here are the possible classes this type could be."
@JsonSubTypes({
    @JsonSubTypes.Type(value = CreditCard.class, name = "CreditCard"),
    @JsonSubTypes.Type(value = PayPal.class, name = "PayPal"),
    @JsonSubTypes.Type(value = BankTransfer.class, name = "BankTransfer")
})
public sealed interface PaymentMethod 
    permits CreditCard, PayPal, BankTransfer {

}
