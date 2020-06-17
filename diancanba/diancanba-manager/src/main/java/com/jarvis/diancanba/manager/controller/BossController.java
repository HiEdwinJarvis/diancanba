package com.jarvis.diancanba.manager.controller;
import java.util.List;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbBoss;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.manager.service.BossService;
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
	 * @param boss
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody DcbBoss boss){
		try {
			bossService.add(boss);
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


	//审核通过
	@RequestMapping("/pass")
	public Result pass(String bossid){

		DcbBoss one = findOne(bossid);
		one.setDcbBossstatus(1);

		DcbRestaurant restaurantByBossId = restaurantService.findRestaurantByBossId(bossid);


		try{
			bossService.update(one);
			restaurantByBossId.setDcbRestaurantstatus(1);
			restaurantService.update(restaurantByBossId);
			return new Result(true,"审核通过");
		}catch (Exception e){
			return new Result(false,"操作失败,请刷新重试");
		}


	}

	@RequestMapping("/back")
	public Result back(String bossid){

		DcbBoss one = findOne(bossid);
		one.setDcbBossstatus(2);
		try{
			bossService.update(one);
			return new Result(true,"已驳回申请");
		}catch (Exception e){
			return new Result(false,"操作失败,请刷新重试");
		}

	}
	/*
	*
	* 根据bossid查找对应的restaurant信息
	*/

	@RequestMapping("/findRestaurantByBossId")
	public DcbRestaurant findRestaurantByBossId(String bossId){
		System.out.println("==========="+bossId);
		DcbRestaurant restaurant = restaurantService.findRestaurantByBossId(bossId);

		return restaurant;

	}

	/**
	 *
	 * 查找所有通过审核的boss列表
	 */

	@RequestMapping("/findBossList")
	public PageResult findBossList(int page, int rows){
		DcbBoss boss = new DcbBoss();
		boss.setDcbBossstatus(1);
		return bossService.findPageStatus(boss,page, rows);
	}

}
