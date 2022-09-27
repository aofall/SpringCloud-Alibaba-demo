package com.example.customer.client;

import org.example.model.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider")
public interface ProviderFeign {

    @GetMapping("/hello")
    Result<?> hello();

}
