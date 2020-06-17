package com.jarvis.diancanba.manager.controller;
import java.util.List;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbMonthbill;
import com.jarvis.diancanba.manager.service.MonthbillService;
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
@RequestMapping("/monthbill")
public class MonthbillController {

	@Autowired
	private MonthbillService monthbillService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<DcbMonthbill> findAll(){
		return monthbillService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return monthbillService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param monthbill
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody DcbMonthbill monthbill){
		try {
			monthbillService.add(monthbill);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param monthbill
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody DcbMonthbill monthbill){
		try {
			monthbillService.update(monthbill);
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
	public DcbMonthbill findOne(Long id){
		return monthbillService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			monthbillService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}

	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbMonthbill monthbill, int page, int rows  ){
		return monthbillService.findPage(monthbill, page, rows);		
	}


	@RequestMapping("/show")
	public List<DcbMonthbill> show(int year,int month){

		return monthbillService.show(year,month);
	}
}
