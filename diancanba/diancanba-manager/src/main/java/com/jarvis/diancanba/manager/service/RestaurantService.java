package com.jarvis.diancanba.manager.service;
import java.util.List;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface RestaurantService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<DcbRestaurant> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(DcbRestaurant restaurant);
	
	
	/**
	 * 修改
	 */
	public void update(DcbRestaurant restaurant);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public DcbRestaurant findOne(Long id);
	
	
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
	public PageResult findPage(DcbRestaurant restaurant, int pageNum, int pageSize);


	/**
	 * 根据bossid查找相应的restaurant
	 */
	public DcbRestaurant findRestaurantByBossId(String bossId);
}
