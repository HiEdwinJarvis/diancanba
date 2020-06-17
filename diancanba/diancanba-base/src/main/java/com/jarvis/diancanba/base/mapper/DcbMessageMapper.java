package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbMessage;
import com.jarvis.diancanba.base.pojo.DcbMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbMessageMapper {
    int countByExample(DcbMessageExample example);

    int deleteByExample(DcbMessageExample example);

    int deleteByPrimaryKey(Long dcbMessageid);

    int insert(DcbMessage record);

    int insertSelective(DcbMessage record);

    List<DcbMessage> selectByExample(DcbMessageExample example);

    DcbMessage selectByPrimaryKey(Long dcbMessageid);

    int updateByExampleSelective(@Param("record") DcbMessage record, @Param("example") DcbMessageExample example);

    int updateByExample(@Param("record") DcbMessage record, @Param("example") DcbMessageExample example);

    int updateByPrimaryKeySelective(DcbMessage record);

    int updateByPrimaryKey(DcbMessage record);
}