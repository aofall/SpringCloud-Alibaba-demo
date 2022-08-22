package com.example.customer.controller;

import com.example.customer.client.ProviderFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController {

    @Resource
    private ProviderFeign providerFeign;

    @RequestMapping("/hello")
    public String hello() {
        StringBuilder str = new StringBuilder();
        str.append("I am customer,The following information is from the provider:");
        str.append("\n");
        str.append(providerFeign.hello());
        return str.toString();
    }


}
