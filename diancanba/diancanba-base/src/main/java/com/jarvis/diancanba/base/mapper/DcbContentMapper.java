package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbContent;
import com.jarvis.diancanba.base.pojo.DcbContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbContentMapper {
    int countByExample(DcbContentExample example);

    int deleteByExample(DcbContentExample example);

    int deleteByPrimaryKey(Long dcbContentid);

    int insert(DcbContent record);

    int insertSelective(DcbContent record);

    List<DcbContent> selectByExample(DcbContentExample example);

    DcbContent selectByPrimaryKey(Long dcbContentid);

    int updateByExampleSelective(@Param("record") DcbContent record, @Param("example") DcbContentExample example);

    int updateByExample(@Param("record") DcbContent record, @Param("example") DcbContentExample example);

    int updateByPrimaryKeySelective(DcbContent record);

    int updateByPrimaryKey(DcbContent record);
}