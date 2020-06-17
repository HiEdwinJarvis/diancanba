package com.jarvis.diancanba.user.controller;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.base.pojo.DcbTwocategory;
import com.jarvis.diancanba.common.utils.CookieUtil;
import com.jarvis.diancanba.user.service.OnecategoryService;
import com.jarvis.diancanba.user.service.RestaurantService;
import com.jarvis.diancanba.user.service.TwocategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/twocategory")
public class TwocategoryController {

	@Autowired
	private TwocategoryService twocategoryService;

	@Autowired
	private RestaurantService restaurantService;

	@Autowired
	private OnecategoryService onecategoryService;

	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<DcbTwocategory> findAll(){
		return twocategoryService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return twocategoryService.findPage(page, rows);
	}
	

	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public DcbTwocategory findOne(Long id){
		return twocategoryService.findOne(id);		
	}
	


	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbTwocategory twocategory, int page, int rows  ){

		/**
		 * 根据登录人，找到店铺id
		 * */
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		System.out.println(restaurant.getDcbRestaurantid());
		twocategory.setDcbRestaurantid(restaurant.getDcbRestaurantid());

		return twocategoryService.findPage(twocategory, page, rows);
	}





	/**
	 * g根据餐馆id所属餐馆的二级分类列表，供添加餐品时选择所属的二级分类
	 *
	 */

	@RequestMapping("/findTwoCategoryList")
	public List<DcbTwocategory> findTwoCategoryList(){
		String restaurantId = CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");


		System.out.println("restaurantid="+restaurantId);

        List<DcbTwocategory> twoListByRestaurantId = twocategoryService.findTwoListByRestaurantId(Long.valueOf(restaurantId));

		return twoListByRestaurantId;
	}

}
