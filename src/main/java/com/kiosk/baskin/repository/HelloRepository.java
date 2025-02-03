package com.kiosk.baskin.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kiosk.baskin.dto.Dummy;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class HelloRepository {
    
    private final SqlSessionTemplate sqlSessionTemplate;

    public List<Dummy> hello() {
        List<Dummy> list = sqlSessionTemplate.selectList("DummyMapper.getDummyAll2");
        return list;
    }
}
