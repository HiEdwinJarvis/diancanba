package com.jarvis.diancanba.user.service;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbOnecategory;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface OnecategoryService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<DcbOnecategory> findAll();
	
	
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
	public DcbOnecategory findOne(Long id);
	
	

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(DcbOnecategory onecategory, int pageNum, int pageSize);


	/**
	 *
	 * 根据id删除一节分类
	 */
	public void deleteById(Long id);


	public List<DcbOnecategory> findListByRestaurant(Long restaurantId);
}
