package com.jarvis.diancanba.user.service;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbFood;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface FoodService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<DcbFood> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public DcbFood findOne(Long id);
	
	

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(DcbFood food, int pageNum, int pageSize);
	
}
