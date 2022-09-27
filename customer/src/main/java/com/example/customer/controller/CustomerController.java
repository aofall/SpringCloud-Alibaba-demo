package com.example.customer.controller;

import com.example.customer.client.ProviderFeign;
import org.example.model.Result;
import org.example.model.constants.Code;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController {

    @Resource
    private ProviderFeign providerFeign;

    @RequestMapping("/hello")
    public Result<?> hello() {
        return Result.success("Hello, I am customer");
    }

    @RequestMapping("/remote")
    public Result<?> remote() {
        Result<?> hello = providerFeign.hello();
        if (hello != null) {
            String info = "I am customer, The following data is from the provider";
            return Result.success(info, hello.getData());
        } else {
            String info = "I am customer, The provider failed to response";
            return Result.fail(Code.fail, info);
        }
    }


}
