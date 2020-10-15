package com.gqb.springcloud.dao;

import com.gqb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int insert(Payment payment);
    public Payment selectById(@Param("id")Long id);
}
