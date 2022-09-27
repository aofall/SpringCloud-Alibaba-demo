package com.example.provider.controller;

import org.example.model.Result;
import org.example.model.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("/hello")
    public Result<?> hello() {
        User user = new User("张三", 1);
        return Result.success("I am provider", user);
    }

}
