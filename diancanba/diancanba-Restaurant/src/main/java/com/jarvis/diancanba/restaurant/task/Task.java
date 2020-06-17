package com.jarvis.diancanba.restaurant.task;

import com.alibaba.fastjson.JSON;
import com.jarvis.diancanba.base.entity.ShowList;
import com.jarvis.diancanba.base.mapper.DcbDaybillMapper;
import com.jarvis.diancanba.base.mapper.DcbMonthbillMapper;
import com.jarvis.diancanba.base.mapper.DcbRestaurantMapper;
import com.jarvis.diancanba.base.pojo.*;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/3/25 12:59
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/25 12:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Component
@EnableScheduling
public class Task {

    /*
    * 测试 spring task
    *
    * */
    /*@Scheduled(cron="* * * * * ?")
    public void springTaskTest(){
        System.out.println("spring task");
    }*/


    @Autowired
    private DcbRestaurantMapper restaurantMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private DcbDaybillMapper daybillMapper;

    /*
    * 每日的0点 将redis里的数据汇总一下
    * 将日期和 今日的营业额汇总到daybill表中，
    * 然后可以可以在前端显示在折现表中
    *
    *
    * */
    @Scheduled(cron="0 58 23 ? * *")//每日的数据汇总在23点58分
    public void huizong(){
        //查找所有已经审核通过的店铺
        DcbRestaurantExample example = new DcbRestaurantExample();
        DcbRestaurantExample.Criteria criteria = example.createCriteria();
        criteria.andDcbRestaurantstatusEqualTo(1);
        List<DcbRestaurant> dcbRestaurants = restaurantMapper.selectByExample(example);

        System.out.println("打印查到的状态为1的数量"+dcbRestaurants.size());


        try {
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
        }catch(Exception e){
        }


    }

    /*
    * 每月1号的23点执行
    *
    * */


    @Autowired
    private DcbMonthbillMapper monthbillMapper;

    @Scheduled(cron="0 0 1 1 * ?")//月汇总，在每月的一号一点执行
    public void yuehuizong(){
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
                daybillMapper.deleteByPrimaryKey(daybill.getDcbDaybillid());//日数据汇总一条删除一条
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
