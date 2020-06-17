package com.jarvis.diancanba.manager.controller;
import java.util.List;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.manager.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<DcbRestaurant> findAll(){
		return restaurantService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return restaurantService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param restaurant
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody DcbRestaurant restaurant){
		try {
			restaurantService.add(restaurant);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param restaurant
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody DcbRestaurant restaurant){
		try {
			restaurantService.update(restaurant);
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
	public DcbRestaurant findOne(Long id){
		return restaurantService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			restaurantService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	

	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbRestaurant restaurant, int page, int rows  ){
		return restaurantService.findPage(restaurant, page, rows);		
	}
	
}
