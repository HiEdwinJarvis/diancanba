package com.jarvis.diancanba.restaurant.controller;
import java.util.List;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbOnecategory;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.base.pojo.DcbTwocategory;
import com.jarvis.diancanba.restaurant.service.OnecategoryService;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import com.jarvis.diancanba.restaurant.service.TwocategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	 * 增加
	 * @param twocategory
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody DcbTwocategory twocategory){
		/**
		 * 添加之前先获得当前登录人
		 * 然后获得餐馆id赋值给实体对象
		 * */
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		twocategory.setDcbRestaurantid(restaurant.getDcbRestaurantid());


		try {
			twocategoryService.add(twocategory);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param twocategory
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody DcbTwocategory twocategory){
		try {
			twocategoryService.update(twocategory);
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
	public DcbTwocategory findOne(Long id){
		return twocategoryService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			twocategoryService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
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
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbRestaurant restaurant = restaurantService.findRestaurantbyBossId(name);
		System.out.println(restaurant.getDcbRestaurantid());


		List<DcbTwocategory> listByRestaurant = twocategoryService.findTwoListByRestaurantId(restaurant.getDcbRestaurantid());
		return listByRestaurant;
	}

}
