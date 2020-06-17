package com.jarvis.diancanba.restaurant.service.impl;


import com.alibaba.fastjson.JSON;
import com.jarvis.diancanba.base.entity.ShowList;
import com.jarvis.diancanba.base.mapper.DcbDaybillMapper;
import com.jarvis.diancanba.base.mapper.DcbMonthbillMapper;
import com.jarvis.diancanba.base.mapper.DcbRestaurantMapper;
import com.jarvis.diancanba.base.pojo.*;
import com.jarvis.diancanba.restaurant.service.BossService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @Description:
 * @CreateDate: 2019/11/25 9:46
 * @UpdateUser: jarvis
 * @UpdateDate: 2019/11/25 9:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springContext.xml", "classpath:springContext-druid.xml",
        "classpath:springContext-mybaits.xml","classpath:mybatis.xml"
        ,"classpath:SqlMapConfig.xml","classpath:springContext-redis.xml"})
public class BossServiceImplTest {

    @Autowired
    private BossService bossService;

    @Test
    public void findAll() {
        List<DcbBoss> all = bossService.findAll();
        for (DcbBoss boss : all) {

            System.out.println(boss.getDcbBossid());
        }

    }

    @Test
    public void add() {

        DcbBoss boss = new DcbBoss();
        boss.setDcbBossid("test12");
        boss.setDcbBosspassword("test1");
        boss.setDcbBossname("test1");
        boss.setDcbBossaddress("test1");
        boss.setDcbBosstel("test1");
        boss.setDcbBossstatus(1);
        bossService.add(boss);


    }
    @Autowired
    private DcbMonthbillMapper monthbillMapper;
    @Autowired
    private DcbRestaurantMapper restaurantMapper;
    @Autowired
    private DcbDaybillMapper daybillMapper;
@Autowired
private  RedisTemplate redisTemplate;

    @Test
    public void daybill(){
//查找所有已经审核通过的店铺
        DcbRestaurantExample example = new DcbRestaurantExample();
        DcbRestaurantExample.Criteria criteria = example.createCriteria();
        criteria.andDcbRestaurantstatusEqualTo(1);
        List<DcbRestaurant> dcbRestaurants = restaurantMapper.selectByExample(example);

        System.out.println("打印查到的状态为1的数量"+dcbRestaurants.size());


            for(DcbRestaurant restaurant : dcbRestaurants) {
                Float money =0f;
                System.out.println("000000000" + restaurant.getDcbRestaurantid());
                List values = redisTemplate.boundHashOps(restaurant.getDcbRestaurantid().toString()).values();
                System.out.println("valuesSize=" + values.size());
                System.out.println(values);
                for (int i = 0; i < values.size(); i++) {

                    String str = (String) values.get(i);
                    System.out.println("-------------" + str);
                    ShowList showList = (ShowList) JSON.parseObject(str, ShowList.class);
                    //只显示未处理的单子
                    if (showList.getStatus() == 1) {
                        System.out.println("=====>" + showList.getMoney());
                        money += showList.getMoney();

                    }


                }
                System.out.println("mongey" + money);
                DcbDaybill daybill = new DcbDaybill();
                daybill.setDcbRestaurantid(restaurant.getDcbRestaurantid());
                daybill.setDcbDate(new Date());
                daybill.setDcbSummoney(money);
                daybill.setDcbDaybilldate(new Date());
                daybill.setDcbRestaurantname(restaurant.getDcbRestaurantname());
                daybillMapper.insert(daybill);
                redisTemplate.delete(restaurant.getDcbRestaurantid().toString());
            }


    }
    @Test
    public void monthbill() {

        //查找所有已经审核通过的店铺
        DcbRestaurantExample example = new DcbRestaurantExample();
        DcbRestaurantExample.Criteria criteria = example.createCriteria();
        criteria.andDcbRestaurantstatusEqualTo(1);
        List<DcbRestaurant> dcbRestaurants = restaurantMapper.selectByExample(example);

        System.out.println("打印查到的状态为1的数量" + dcbRestaurants.size());


            for (DcbRestaurant restaurant : dcbRestaurants) {



                DcbDaybillExample example1 = new DcbDaybillExample();
                DcbDaybillExample.Criteria criteria1 = example1.createCriteria();
                criteria1.andDcbRestaurantidEqualTo(restaurant.getDcbRestaurantid());

                List<DcbDaybill> dcbDaybills = daybillMapper.selectByExample(example1);

                System.out.println("dcbDaybills====" + dcbDaybills.size());

                Float money = 0f;
                for (DcbDaybill daybill : dcbDaybills) {
                    money += daybill.getDcbSummoney();
                }
                DcbMonthbill monthbill = new DcbMonthbill();
                monthbill.setDcbMonthbillincomeafter(money);
                monthbill.setDcbMonthbilldatetime(new Date());
                monthbill.setDcbRestaurantid(restaurant.getDcbRestaurantid());
                monthbill.setDcbRestaurantname(restaurant.getDcbRestaurantname());
                System.out.println("new Date == "+monthbill.getDcbMonthbilldatetime().toString().substring(6,8));

                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                Date date = new Date();
                System.out.println("当前日期字符串：" + format.format(date) + "。");
                String str =  format.format(date);

                monthbill.setDcbMonth(Integer.valueOf(str.substring(5,7)));
                monthbill.setDcbMonthbillstatus(Integer.valueOf(str.substring(0,4)));


                monthbillMapper.insert(monthbill);

            }


        }
    }




