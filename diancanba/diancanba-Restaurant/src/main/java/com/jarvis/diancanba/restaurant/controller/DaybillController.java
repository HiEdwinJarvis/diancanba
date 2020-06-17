package com.jarvis.diancanba.restaurant.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.jarvis.diancanba.base.entity.*;
import com.jarvis.diancanba.base.pojo.DcbDaybill;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.restaurant.service.DaybillService;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/daybill")
public class DaybillController {

	@Autowired
	private DaybillService daybillService;

	@Autowired
	private RedisTemplate redisTemplate;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return daybillService.findPage(page, rows);
	}
	



	
@Autowired
private RestaurantService restaurantService;

	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbDaybill daybill, int page, int rows  ){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		System.out.println(restaurant.getDcbRestaurantid());
		daybill.setDcbRestaurantid(restaurant.getDcbRestaurantid());

		return daybillService.findPage(daybill, page, rows);		
	}

	/*汇总*/



	@RequestMapping("/huizong")
	public Result huizong(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		System.out.println("=======><"+restaurant.getDcbRestaurantid());
		return daybillService.huizong(restaurant);


	}

	/*
	* 测试查询状态为1
	* */
	@RequestMapping("/show")
	public List<ShowList> show(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		System.out.println("=======><"+restaurant.getDcbRestaurantid());
		List values = redisTemplate.boundHashOps(restaurant.getDcbRestaurantid().toString()).values();
		List<ShowList> showLists = new ArrayList<ShowList>();
		System.out.println("======>" + values);
		for (int i = 0; i < values.size(); i++) {

			String str = (String) values.get(i);
			System.out.println(str);
			ShowList showList = (ShowList) JSON.parseObject(str, ShowList.class);
			//只显示未处理的单子
			if (showList.getStatus() == 1) {

				showLists.add(showList);
			}


		}

		return showLists;


	}

	/*
	* 插叙当月所有的每天营业额
	*
	* 因为springtask项目将在每个月的一号进行营业额汇总，所以查询出来的所有店铺信息就是当月的信息
	* */

	@RequestMapping("/findBill")
	public float[] findBill(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);

		float[] arr = new float[32];

		List<DcbDaybill> billList = daybillService.findByRest(restaurant.getDcbRestaurantid());


//int i = 0;
		for(DcbDaybill bill : billList){
			String str = bill.getDcbDaybilldate().toString().substring(8,10);
			System.out.println(str);

			int d = Integer.valueOf(str);
			arr[d] = bill.getDcbSummoney();


		}
		return arr;


	}


	
}
