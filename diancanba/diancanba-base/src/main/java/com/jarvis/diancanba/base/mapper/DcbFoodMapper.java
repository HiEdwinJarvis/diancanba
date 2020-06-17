package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbFood;
import com.jarvis.diancanba.base.pojo.DcbFoodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbFoodMapper {
    int countByExample(DcbFoodExample example);

    int deleteByExample(DcbFoodExample example);

    int deleteByPrimaryKey(Long dcbFoodid);

    int insert(DcbFood record);

    int insertSelective(DcbFood record);

    List<DcbFood> selectByExample(DcbFoodExample example);

    DcbFood selectByPrimaryKey(Long dcbFoodid);

    int updateByExampleSelective(@Param("record") DcbFood record, @Param("example") DcbFoodExample example);

    int updateByExample(@Param("record") DcbFood record, @Param("example") DcbFoodExample example);

    int updateByPrimaryKeySelective(DcbFood record);

    int updateByPrimaryKey(DcbFood record);
}