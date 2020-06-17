package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbDaybill;
import com.jarvis.diancanba.base.pojo.DcbDaybillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbDaybillMapper {
    int countByExample(DcbDaybillExample example);

    int deleteByExample(DcbDaybillExample example);

    int deleteByPrimaryKey(Long dcbDaybillid);

    int insert(DcbDaybill record);

    int insertSelective(DcbDaybill record);

    List<DcbDaybill> selectByExample(DcbDaybillExample example);

    DcbDaybill selectByPrimaryKey(Long dcbDaybillid);

    int updateByExampleSelective(@Param("record") DcbDaybill record, @Param("example") DcbDaybillExample example);

    int updateByExample(@Param("record") DcbDaybill record, @Param("example") DcbDaybillExample example);

    int updateByPrimaryKeySelective(DcbDaybill record);

    int updateByPrimaryKey(DcbDaybill record);
}