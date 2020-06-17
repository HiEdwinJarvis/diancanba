package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbMonthbill;
import com.jarvis.diancanba.base.pojo.DcbMonthbillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbMonthbillMapper {
    int countByExample(DcbMonthbillExample example);

    int deleteByExample(DcbMonthbillExample example);

    int deleteByPrimaryKey(Long dcbMonthbillid);

    int insert(DcbMonthbill record);

    int insertSelective(DcbMonthbill record);

    List<DcbMonthbill> selectByExample(DcbMonthbillExample example);

    DcbMonthbill selectByPrimaryKey(Long dcbMonthbillid);

    int updateByExampleSelective(@Param("record") DcbMonthbill record, @Param("example") DcbMonthbillExample example);

    int updateByExample(@Param("record") DcbMonthbill record, @Param("example") DcbMonthbillExample example);

    int updateByPrimaryKeySelective(DcbMonthbill record);

    int updateByPrimaryKey(DcbMonthbill record);
}