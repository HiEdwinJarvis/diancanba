package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbTwocategory;
import com.jarvis.diancanba.base.pojo.DcbTwocategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbTwocategoryMapper {
    int countByExample(DcbTwocategoryExample example);

    int deleteByExample(DcbTwocategoryExample example);

    int deleteByPrimaryKey(Long dcbTwocategoryid);

    int insert(DcbTwocategory record);

    int insertSelective(DcbTwocategory record);

    List<DcbTwocategory> selectByExample(DcbTwocategoryExample example);

    DcbTwocategory selectByPrimaryKey(Long dcbTwocategoryid);

    int updateByExampleSelective(@Param("record") DcbTwocategory record, @Param("example") DcbTwocategoryExample example);

    int updateByExample(@Param("record") DcbTwocategory record, @Param("example") DcbTwocategoryExample example);

    int updateByPrimaryKeySelective(DcbTwocategory record);

    int updateByPrimaryKey(DcbTwocategory record);
}