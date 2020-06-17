package com.jarvis.diancanba.user.controller;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbOnecategory;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.common.utils.CookieUtil;
import com.jarvis.diancanba.user.service.OnecategoryService;
import com.jarvis.diancanba.user.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
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
@RequestMapping("/onecategory")
public class OnecategoryController {

	@Autowired
	private OnecategoryService onecategoryService;

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
	@RequestMapping("/findAll")
	public List<DcbOnecategory> findAll(){
		return onecategoryService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		//当前的登录人
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		//当前餐馆
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);

		return onecategoryService.findPage(page, rows);
	}
	

	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public DcbOnecategory findOne(Long id){
		return onecategoryService.findOne(id);		
	}
	

	

	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbOnecategory onecategory, int page, int rows  ){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		System.out.println(restaurant.getDcbRestaurantid());
		onecategory.setDcbRestaurantid(restaurant.getDcbRestaurantid());
		return onecategoryService.findPage(onecategory, page, rows);
	}

	/**
	 *
	 * 根据餐馆id一节分类列表，供前端的下拉列表选择
	 * */
	@RequestMapping("/findOneCategoryList")
	public List<DcbOnecategory> findOneCategoryList(String restaurantId){
		/***
		 * 第一次进来时会带有restauratId
		 * 如果是在别的页面返回到当前页面时则没有restaurantid
		 * 所以就在cookie中拿restaurant
		 *
		 *
		 */
		System.out.println("=================1"+restaurantId);
		if(restaurantId==null || restaurantId==""){//页面跳转情况

			//
			restaurantId=CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");
			System.out.println("=======================2"+restaurantId);

		}
		//去了本平台的不同店铺，或者第一次进则就得清空一次cookie里的清单列表，防止在进入别的店铺时出现另一家的单子
		CookieUtil.setCookie(request, response, "foodList", "", 3600 * 24, "UTF-8");

		//进入其他店铺或者第一次进入店铺时将评论权限关键字IsComment改为 空字符串
		CookieUtil.setCookie(request, response, "IsComment", "", 3600 * 24, "UTF-8");

		//已付款的单子也清空
		CookieUtil.setCookie(request, response, "payed", "", 3600 * 24, "UTF-8");


		CookieUtil.setCookie(request, response, "restaurantId", restaurantId, 3600*24, "UTF-8");
		System.out.println("======================3"+restaurantId);
		Long id = Long.valueOf(restaurantId);
		List<DcbOnecategory> listByRestaurant = onecategoryService.findListByRestaurant(id);
		return listByRestaurant;
	}
	
}
