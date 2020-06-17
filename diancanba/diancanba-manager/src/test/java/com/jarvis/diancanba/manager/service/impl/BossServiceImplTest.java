package com.jarvis.diancanba.manager.service.impl;


import com.jarvis.diancanba.base.mapper.DcbBossMapper;
import com.jarvis.diancanba.base.pojo.DcbBoss;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.manager.service.BossService;
import com.jarvis.diancanba.manager.service.RestaurantService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @CreateDate: 2019/11/24 20:39
 * @UpdateUser: jarvis
 * @UpdateDate: 2019/11/24 20:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springContext.xml", "classpath:springContext-druid.xml", "classpath:springContext-mybaits.xml","classpath:mybatis.xml"})
public class BossServiceImplTest {


    @Autowired
    private DcbBossMapper bossMapper;
    @Autowired
    private BossService bossService;
    @Autowired
    private RestaurantService restaurantService;
    @Test
    public void findAll() {
        List<DcbBoss> dcbBosses = bossMapper.selectByExample(null);
        for(DcbBoss d : dcbBosses){

            System.out.println(d.getDcbBossid());
        }

    }

    @Test
    public void jjjj() {
        List<DcbBoss> dcbBosses = bossService.findAll();
        for(DcbBoss d : dcbBosses){

            System.out.println(d.getDcbBossid());
        }

    }

    @Test
    public void s() {
        List<DcbBoss> dcbBosses = bossService.findAll();
        for(DcbBoss d : dcbBosses){

            System.out.println(d.getDcbBossid());
        }

    }


    @Test
    public void findRestaurantBybossid() {
        DcbRestaurant restaurantByBossId = restaurantService.findRestaurantByBossId("tengxun");
        System.out.println(restaurantByBossId.getDcbRestaurantname());

    }
}
