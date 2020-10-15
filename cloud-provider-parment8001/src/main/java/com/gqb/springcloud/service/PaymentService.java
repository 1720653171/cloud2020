package com.gqb.springcloud.service;

import com.gqb.springcloud.entities.Payment;

public interface PaymentService {
    public int insert(Payment payment);
    public Payment SelectById(Long id);
}
