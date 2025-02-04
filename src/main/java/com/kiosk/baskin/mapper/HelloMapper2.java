package com.kiosk.baskin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.kiosk.baskin.dto.Dummy;

@Mapper
public interface HelloMapper2 {
    
    @Select("select * from dummy")
    List<Dummy> getDummyAll();

    @Insert("insert into dummy(dummy_name) values (#{dummyName})")
    int insert(Dummy dummy);

    @Update("update dummy set dummy_name = #{dummyName} where dummy_id = 2")
    int updateDummy(@Param("dummyName") String dummyName);

    @Delete("delete from dummy where dummy_id = #{dummyId}")
    int deleteDummy(int dummyId);
}
