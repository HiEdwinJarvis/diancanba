package com.jarvis.diancanba.restaurant.controller;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbDaybill;
import com.jarvis.diancanba.base.pojo.DcbMonthbill;

import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.restaurant.service.MonthbillService;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/monthbill")
public class MonthbillController {

	@Autowired
	private MonthbillService monthbillService;

	@Autowired
	private RestaurantService restaurantService;
	


	/*
	* 根据登录id查找
	* */
	@RequestMapping("findMonthbill")
	private float[] findMonthbill(int year){

		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);

		float[] arr = new float[13];

		List<DcbMonthbill> monthByrestaurant = monthbillService.findMonthByrestaurant(restaurant.getDcbRestaurantid(),year);

		for(DcbMonthbill monthbill : monthByrestaurant){
			arr[monthbill.getDcbMonth()] = monthbill.getDcbMonthbillincomeafter();
		}



		return arr;



	}
}
