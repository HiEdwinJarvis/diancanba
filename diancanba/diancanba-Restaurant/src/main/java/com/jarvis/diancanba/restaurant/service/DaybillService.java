package com.jarvis.diancanba.restaurant.service;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbDaybill;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface DaybillService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<DcbDaybill> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(DcbDaybill daybill);
	
	
	/**
	 * 修改
	 */
	public void update(DcbDaybill daybill);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public DcbDaybill findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(DcbDaybill daybill, int pageNum, int pageSize);

	public Result huizong(DcbRestaurant restaurant);

	/*
	* 根据店铺id信息
	* */
	public List<DcbDaybill> findByRest(Long id);


	
}
