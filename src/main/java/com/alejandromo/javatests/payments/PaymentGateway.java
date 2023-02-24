package com.alejandromo.javatests.payments;

public interface PaymentGateway {
    PaymentResponse requestPaymment(PaymentRequest request);
}
