package com.jarvis.diancanba.restaurant.service.impl;


import com.github.pagehelper.Page;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbOnecategoryMapper;
import com.jarvis.diancanba.base.pojo.DcbOnecategory;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.restaurant.service.OnecategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Description:
 * @CreateDate: 2019/11/28 20:08
 * @UpdateUser: jarvis
 * @UpdateDate: 2019/11/28 20:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springContext.xml", "classpath:springContext-druid.xml", "classpath:springContext-mybaits.xml","classpath:mybatis.xml","classpath:SqlMapConfig.xml"})
public class OnecategoryServiceImplTest {
    @Autowired
    private OnecategoryService onecategoryService;

    @Autowired
    private DcbOnecategoryMapper onecategoryMapper;


    @Test
    public void update() {
        //onecategoryMapper.deleteByPrimaryKey(5L);

        DcbOnecategory onecategory = new DcbOnecategory();
        onecategory.setDcbOnecategoryid(9L);
        onecategory.setDcbRestaurantid(1L);
        onecategory.setDcbOnecategoryname("dddddddddddnnnn");
        onecategory.setDcbOnecategorydesc("dfdfdfdf");
        //onecategory.setDcbOnecategorypicture("192.168.232.132:8888/group1/M00/00/00/wKjohF3f0AGAWsZpAAQ76HvCZoo286.jpg");
        onecategoryService.update(onecategory);
    }

    @Test
    public void add() {

        DcbOnecategory onecategory = new DcbOnecategory();

        onecategory.setDcbRestaurantid(1L);
        onecategory.setDcbOnecategoryname("测试");
        onecategory.setDcbOnecategorydesc("测试");

        onecategoryService.add(onecategory);
    }
    @Test
    public void findPage(){
        DcbOnecategory onecategory = new DcbOnecategory();
        onecategory.setDcbRestaurantid(2L);

        PageResult page = onecategoryService.findPage(onecategory, 1, 10);


    }
}
