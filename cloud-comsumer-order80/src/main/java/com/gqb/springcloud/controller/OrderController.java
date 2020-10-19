package com.gqb.springcloud.controller;

import com.gqb.springcloud.entities.CommonResult;
import com.gqb.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    public static final String PARMENT_URL = "http://127.0.0.1:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/insert")
    public CommonResult<Payment> insert(@RequestBody Payment payment){
        return restTemplate.postForObject(PARMENT_URL+"/payment/insert",payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/select/{id}")
    public CommonResult<Payment> select(@PathVariable("id") Long id){
        return restTemplate.getForObject(PARMENT_URL+"/payment/select/"+id,CommonResult.class);
    }
}
