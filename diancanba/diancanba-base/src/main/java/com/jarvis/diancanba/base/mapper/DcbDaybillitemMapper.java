package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbDaybillitem;
import com.jarvis.diancanba.base.pojo.DcbDaybillitemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbDaybillitemMapper {
    int countByExample(DcbDaybillitemExample example);

    int deleteByExample(DcbDaybillitemExample example);

    int deleteByPrimaryKey(Long dcbDaybillitemid);

    int insert(DcbDaybillitem record);

    int insertSelective(DcbDaybillitem record);

    List<DcbDaybillitem> selectByExample(DcbDaybillitemExample example);

    DcbDaybillitem selectByPrimaryKey(Long dcbDaybillitemid);

    int updateByExampleSelective(@Param("record") DcbDaybillitem record, @Param("example") DcbDaybillitemExample example);

    int updateByExample(@Param("record") DcbDaybillitem record, @Param("example") DcbDaybillitemExample example);

    int updateByPrimaryKeySelective(DcbDaybillitem record);

    int updateByPrimaryKey(DcbDaybillitem record);
}