package com.jarvis.diancanba.restaurant.controller;

import com.jarvis.diancanba.base.entity.BossAndRestaurant;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbBoss;

import com.jarvis.diancanba.restaurant.service.BossService;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/boss")
public class BossController {

	@Autowired
	private BossService bossService;

	@Autowired
	private RestaurantService restaurantService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<DcbBoss> findAll(){
		return bossService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return bossService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody BossAndRestaurant bossAndRestaurant){
		try {
			System.out.println("===============add");
			System.out.println(bossAndRestaurant.getBoss().getDcbBosspassword());
			System.out.println(bossAndRestaurant.getRestaurant().getDcbRestaurantaddress());
			bossAndRestaurant.getBoss().setDcbRestaurantname(bossAndRestaurant.getRestaurant().getDcbRestaurantname());
			//注册添加
			bossService.register(bossAndRestaurant);

			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param boss
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody DcbBoss boss){
		try {
			System.out.println("===============update");
			bossService.update(boss);
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
	public DcbBoss findOne(String id){
		return bossService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(String [] ids){
		try {
			bossService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	

	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbBoss boss, int page, int rows  ){
		return bossService.findPage(boss, page, rows);		
	}
	
}
