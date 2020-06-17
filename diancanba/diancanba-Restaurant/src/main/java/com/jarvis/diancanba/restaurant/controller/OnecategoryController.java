package com.jarvis.diancanba.restaurant.controller;
import java.util.List;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbOnecategory;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.restaurant.service.OnecategoryService;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/onecategory")
public class OnecategoryController {

	@Autowired
	private OnecategoryService onecategoryService;

	@Autowired
	private RestaurantService restaurantService;
	
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
	 * 增加
	 * @param onecategory
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody DcbOnecategory onecategory){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		onecategory.setDcbRestaurantid(restaurant.getDcbRestaurantid());



		try {

			onecategoryService.add(onecategory);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param onecategory
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody DcbOnecategory onecategory){
		try {
			onecategoryService.update(onecategory);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
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
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			onecategoryService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
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
	public List<DcbOnecategory> findOneCategoryList(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		System.out.println(restaurant.getDcbRestaurantid());
		List<DcbOnecategory> listByRestaurant = onecategoryService.findListByRestaurant(restaurant.getDcbRestaurantid());
		return listByRestaurant;
	}
	
}
