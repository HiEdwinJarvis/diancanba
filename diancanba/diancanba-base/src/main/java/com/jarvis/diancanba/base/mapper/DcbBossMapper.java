package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbBoss;
import com.jarvis.diancanba.base.pojo.DcbBossExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface DcbBossMapper {
    int countByExample(DcbBossExample example);

    int deleteByExample(DcbBossExample example);

    int deleteByPrimaryKey(String dcbBossid);

    int insert(DcbBoss record);

    int insertSelective(DcbBoss record);

    List<DcbBoss> selectByExample(DcbBossExample example);

    DcbBoss selectByPrimaryKey(String dcbBossid);

    int updateByExampleSelective(@Param("record") DcbBoss record, @Param("example") DcbBossExample example);

    int updateByExample(@Param("record") DcbBoss record, @Param("example") DcbBossExample example);

    int updateByPrimaryKeySelective(DcbBoss record);

    int updateByPrimaryKey(DcbBoss record);
}