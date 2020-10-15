package com.gqb.springcloud.service.impl;

import com.gqb.springcloud.dao.PaymentDao;
import com.gqb.springcloud.entities.Payment;
import com.gqb.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment SelectById(Long id) {
        return paymentDao.selectById(id);
    }
}
