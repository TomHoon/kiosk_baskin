package com.kiosk.baskin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiosk.baskin.dto.Dummy;
import com.kiosk.baskin.service.HelloService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;
    
    @GetMapping("/hello")
    public List<Dummy> hello() {
        return helloService.hello();
    }
}
