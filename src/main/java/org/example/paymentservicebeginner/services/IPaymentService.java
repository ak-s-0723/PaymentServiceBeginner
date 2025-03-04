package org.example.paymentservicebeginner.services;

public interface IPaymentService {

    String initiatePayment(String email,String name, String phoneNumber,String orderId, Long amount);
}
