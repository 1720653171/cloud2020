package com.gqb.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @RequestMapping("/test")
    public String Test(){
        return "sucess";
    }

    @RequestMapping("/test2")
    public String Test2() {

        return "2222";
    }
}
