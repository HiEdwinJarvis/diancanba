package com.jarvis.diancanba.restaurant.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.jarvis.diancanba.base.entity.NoteList;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.entity.ShowList;
import com.jarvis.diancanba.base.pojo.DcbFood;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.restaurant.service.FoodService;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private RestaurantService restaurantService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<DcbFood> findAll() {
        return foodService.findAll();
    }


    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return foodService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param food
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody DcbFood food) {

        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
        DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
        System.out.println(restaurant.getDcbRestaurantid());
        food.setDcbRestaurantid(restaurant.getDcbRestaurantid());

        try {
            foodService.add(food);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param food
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody DcbFood food) {
        try {
            foodService.update(food);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 获取实体
     *
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public DcbFood findOne(Long id) {
        return foodService.findOne(id);
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long[] ids) {
        try {
            foodService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }


    @RequestMapping("/search")
    public PageResult search(@RequestBody DcbFood food, int page, int rows) {
        /**
         * 根据登录人，找到店铺id
         * */
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
        DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
        System.out.println(restaurant.getDcbRestaurantid());
        food.setDcbRestaurantid(restaurant.getDcbRestaurantid());

        return foodService.findPage(food, page, rows);
    }

    /**
     * 测试redis
     */
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/get")
    public String getTest(String uuid) {

        return (String) redisTemplate.boundHashOps("test").get(uuid);
    }

    @RequestMapping("/showList")
    public List<ShowList> showList() {

        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
        DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
        System.out.println(restaurant.getDcbRestaurantid());

        List<ShowList> showLists = new ArrayList<ShowList>();

        System.out.println("restaurant.getDcbRestaurantid().toString()"+restaurant.getDcbRestaurantid().toString());


        List values = redisTemplate.boundHashOps(restaurant.getDcbRestaurantid().toString()).values();
        System.out.println("======>" + values);
        for (int i = 0; i < values.size(); i++) {

            String str = (String) values.get(i);
            System.out.println(str);
            ShowList showList = (ShowList) JSON.parseObject(str, ShowList.class);
            //只显示未处理的单子
            if (showList.getStatus() == 0) {

                showLists.add(showList);
            }


        }

        return showLists;


    }

    /**
     * 清空redis
     */
    @RequestMapping("/del")
    public void del() {

        redisTemplate.delete("1");
    }

    /*
     * 测试redis的小健删除
     * */
    @RequestMapping("/addtest")
    public void addTest() {
        for (int i = 0; i < 10; i++) {
            redisTemplate.boundHashOps("test").put("y"+i,"y"+ i);
        }
        redisTemplate.delete("1");
    }

    @RequestMapping("/addtest2")
    public void addTest2() {

        redisTemplate.boundHashOps("test").put("y"+2, "y"+2);
    }

    @RequestMapping("/jian")
    public void jianTest(String i) {
        redisTemplate.boundHashOps("test").delete(i);
    }

    @RequestMapping("/d")
    public void jianTest() {
        redisTemplate.delete("test");
    }

    @RequestMapping("/kan")
    public List kan() {
        List values = redisTemplate.boundHashOps("1").values();
        List list = new ArrayList();
        for (int i = 0; i < values.size(); i++) {
            list.add(values.get(i));

        }
        return list;

    }

    @RequestMapping("/kan1")
    public List kan2() {
        List values = redisTemplate.boundHashOps("7").values();
        List list = new ArrayList();
        for (int i = 0; i < values.size(); i++) {
            list.add(values.get(i));

        }
        return list;

    }

    @RequestMapping("/show2")
    public String showTest2(String i) {
        return redisTemplate.boundHashOps("test").get(i).toString();


    }

    /**
     * 处理单子功能
     * 将状态改为1（已处理状态）
     */

    @RequestMapping("/deal")
    public Result deal(String id) {

        System.out.println("===id-===" + id);


        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
        DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
        System.out.println(restaurant.getDcbRestaurantid());

        List<ShowList> showLists = new ArrayList<ShowList>();
        try {
            //获取该id的菜
            String s = redisTemplate.boundHashOps(restaurant.getDcbRestaurantid().toString()).get(id).toString();
            //string 转ShowList类型
            ShowList showList = (ShowList) JSON.parseObject(s, ShowList.class);
            showList.setStatus(1);//改变状态
            redisTemplate.boundHashOps(String.valueOf(restaurant.getDcbRestaurantid())).delete(id);//删除原来的
            String str = JSON.toJSONString(showList);//json化新的
            System.out.println("str="+str);
            redisTemplate.boundHashOps(restaurant.getDcbRestaurantid().toString()).put(id, str);


            return new Result(true, "已处理");
        } catch (Exception e) {
            return new Result(false, "未知错误");
        }


    }
    /*
    * 测试删除
    * */
    @RequestMapping("/dd")
    public void dd(String i) {
         redisTemplate.boundHashOps("6").delete(i);


    }
    @RequestMapping("/ddd")
    public void ddd(String i) {
        redisTemplate.delete(i);

    }
    @RequestMapping("/showkey")
    public Set showkey() {
        Set liwenliang = redisTemplate.boundHashOps("6").keys();
        return liwenliang;


    }



}

