package com.kiosk.baskin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kiosk.baskin.dto.Dummy;
import com.kiosk.baskin.service.HelloService2;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController2 {
    
    private final HelloService2 helloService2;

    // READ
    @GetMapping("/hello2")
    public List<Dummy> hello2() {
        return helloService2.hello2();
    }

    // CREATE
    @PostMapping("/insert")
    public int insertDummy(@RequestBody Dummy dummy) {
        System.out.println("hello");
        return helloService2.insert(dummy);
    }

    // UPDATE
    @PutMapping("/put")
    public int updateDummy(@RequestBody Map map) {
        return helloService2.updateDummy(map);
    }

    // DELETE
    @DeleteMapping("/delete/{number}")
    public int deleteDummy(@PathVariable int number) {
        return helloService2.deleteDummy(number);
    }   


}
