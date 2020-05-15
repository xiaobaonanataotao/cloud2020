package com.atguigu.springcloud.service.serviceimpl;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixServiceImpl  implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "FeignClient==============paymentInfo_OK========┭┮﹏┭┮";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "FeignClient==============paymentInfo_TimeOut========┭┮﹏┭┮";
    }
}
