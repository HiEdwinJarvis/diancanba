package com.jarvis.diancanba.base.mapper;

import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.base.pojo.DcbRestaurantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcbRestaurantMapper {
    int countByExample(DcbRestaurantExample example);

    int deleteByExample(DcbRestaurantExample example);

    int deleteByPrimaryKey(Long dcbRestaurantid);

    int insert(DcbRestaurant record);

    int insertSelective(DcbRestaurant record);

    List<DcbRestaurant> selectByExample(DcbRestaurantExample example);

    DcbRestaurant selectByPrimaryKey(Long dcbRestaurantid);

    int updateByExampleSelective(@Param("record") DcbRestaurant record, @Param("example") DcbRestaurantExample example);

    int updateByExample(@Param("record") DcbRestaurant record, @Param("example") DcbRestaurantExample example);

    int updateByPrimaryKeySelective(DcbRestaurant record);

    int updateByPrimaryKey(DcbRestaurant record);
}