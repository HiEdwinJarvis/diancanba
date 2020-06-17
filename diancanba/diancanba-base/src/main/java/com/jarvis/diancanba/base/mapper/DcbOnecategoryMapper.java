package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbOnecategory;
import com.jarvis.diancanba.base.pojo.DcbOnecategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbOnecategoryMapper {
    int countByExample(DcbOnecategoryExample example);

    int deleteByExample(DcbOnecategoryExample example);

    int deleteByPrimaryKey(Long dcbOnecategoryid);

    int insert(DcbOnecategory record);

    int insertSelective(DcbOnecategory record);

    List<DcbOnecategory> selectByExample(DcbOnecategoryExample example);

    DcbOnecategory selectByPrimaryKey(Long dcbOnecategoryid);

    int updateByExampleSelective(@Param("record") DcbOnecategory record, @Param("example") DcbOnecategoryExample example);

    int updateByExample(@Param("record") DcbOnecategory record, @Param("example") DcbOnecategoryExample example);

    int updateByPrimaryKeySelective(DcbOnecategory record);

    int updateByPrimaryKey(DcbOnecategory record);
}