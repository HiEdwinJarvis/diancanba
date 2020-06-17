package com.jarvis.diancanba.restaurant.controller;
import java.util.List;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbDaybillitem;
import com.jarvis.diancanba.restaurant.service.DaybillitemService;
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
@RequestMapping("/daybillitem")
public class DaybillitemController {

	@Autowired
	private DaybillitemService daybillitemService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<DcbDaybillitem> findAll(){
		return daybillitemService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return daybillitemService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param daybillitem
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody DcbDaybillitem daybillitem){
		try {
			daybillitemService.add(daybillitem);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param daybillitem
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody DcbDaybillitem daybillitem){
		try {
			daybillitemService.update(daybillitem);
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
	public DcbDaybillitem findOne(Long id){
		return daybillitemService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			daybillitemService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	

	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbDaybillitem daybillitem, int page, int rows  ){
		return daybillitemService.findPage(daybillitem, page, rows);		
	}
	
}
