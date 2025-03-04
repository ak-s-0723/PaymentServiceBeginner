package org.example.paymentservicebeginner.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentDto {
    String email;
    String name;
    String phoneNumber;
    String orderId;
    Long amount;
}
