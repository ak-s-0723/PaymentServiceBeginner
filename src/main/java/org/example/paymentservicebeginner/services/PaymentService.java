package org.example.paymentservicebeginner.services;

import org.example.paymentservicebeginner.paymentgateways.IPaymentGateway;
import org.example.paymentservicebeginner.paymentgateways.RazorpayPaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private IPaymentGateway paymentGateway;

    @Override
    public String initiatePayment(String email,String name, String phoneNumber,String orderId, Long amount) {
        return paymentGateway.getPaymentLink(email, name, phoneNumber, orderId, amount);
    }
}

