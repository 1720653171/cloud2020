package com.gqb.springcloud.controller;

import com.gqb.springcloud.entities.CommonResult;
import com.gqb.springcloud.entities.Payment;
import com.gqb.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/insert")
    public CommonResult insert(@RequestBody(required=false) Payment payment){
        int result = paymentService.insert(payment);
        log.info("*****插入结果："+result);
        if(result>0){
            return new CommonResult(200,"插入成功");
        }else{
            return new CommonResult(400,"插入失败");
        }
    }

    @RequestMapping(value = "/payment/select/{id}")
    public CommonResult selectById(@PathVariable("id") Long id){

        Payment payment = paymentService.SelectById(id);
        if(payment!=null){
            return new CommonResult(200,"数据查询成功",payment);
        }else {
            return new CommonResult(404,"数据不存在",null);
        }
    }

}
