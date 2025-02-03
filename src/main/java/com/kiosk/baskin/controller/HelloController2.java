package com.kiosk.baskin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiosk.baskin.dto.Dummy;
import com.kiosk.baskin.service.HelloService2;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController2 {
    
    private final HelloService2 helloService2;

    @GetMapping("/hello2")
    public List<Dummy> hello2() {
        return helloService2.hello2();
    }
}
