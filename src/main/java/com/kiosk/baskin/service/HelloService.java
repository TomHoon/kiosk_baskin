package com.kiosk.baskin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiosk.baskin.dto.Dummy;
import com.kiosk.baskin.repository.HelloRepository;

@Service
public class HelloService {

    private HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public List<Dummy> hello() {
        return helloRepository.hello();
    }

}
