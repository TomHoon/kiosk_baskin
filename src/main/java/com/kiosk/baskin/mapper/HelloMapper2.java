package com.kiosk.baskin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.kiosk.baskin.dto.Dummy;

@Mapper
public interface HelloMapper2 {
    
    @Select("select * from dummy")
    List<Dummy> getDummyAll();
}
