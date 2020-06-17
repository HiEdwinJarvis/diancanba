package com.jarvis.diancanba.user.controller;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.common.utils.CookieUtil;
import com.jarvis.diancanba.user.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;


	@Autowired
	private HttpServletRequest request;

	@Autowired
	private HttpServletResponse response;
	
	/**
	 * 返回全部列表
	 * @return
	 */

	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return restaurantService.findPage(page, rows);
	}
	

	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public DcbRestaurant findOne(Long id){
		if(id==null || id==0L){
			String restaurantId = CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");
			id = Long.valueOf(restaurantId);
		}
		System.out.println("id = "+id);
		return restaurantService.findOne(id);		
	}
	

	

	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbRestaurant restaurant, int page, int rows  ){
		return restaurantService.findPage(restaurant, page, rows);		
	}
	
}
