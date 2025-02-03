package com.kiosk.baskin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiosk.baskin.dto.Dummy;
import com.kiosk.baskin.mapper.HelloMapper2;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HelloService2 {
    
    private final HelloMapper2 helloMapper2;

    public List<Dummy> hello2() {
        return helloMapper2.getDummyAll();
    }
}
