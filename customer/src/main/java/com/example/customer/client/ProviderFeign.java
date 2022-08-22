package com.example.customer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider")
public interface ProviderFeign {

    @GetMapping("/hello")
    String hello();

}
