package com.huang.world.service.impl;

import com.huang.world.dao.PaymentDao;
import com.huang.world.pojo.Payment;
import com.huang.world.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
