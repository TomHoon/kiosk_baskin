package com.kiosk.baskin.service;

import java.util.List;
import java.util.Map;

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

    public int insert(Dummy dummy) {
        return helloMapper2.insert(dummy);
    }

    public int updateDummy(Map map) {
        String dummyName = (String)map.get("dummyName");
        return helloMapper2.updateDummy(dummyName);
    }

    public int deleteDummy(int number) {
        return helloMapper2.deleteDummy(number);
    }
}
