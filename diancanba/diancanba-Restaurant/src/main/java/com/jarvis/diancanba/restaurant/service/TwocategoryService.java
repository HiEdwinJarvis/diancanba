package com.jarvis.diancanba.restaurant.service;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbTwocategory;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface TwocategoryService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<DcbTwocategory> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(DcbTwocategory twocategory);
	
	
	/**
	 * 修改
	 */
	public void update(DcbTwocategory twocategory);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public DcbTwocategory findOne(Long id);
	
	
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
	public PageResult findPage(DcbTwocategory twocategory, int pageNum, int pageSize);


	/**
	 *
	 * 根据餐馆iD获取属于该餐馆的二级分类列表
	 */
	public List<DcbTwocategory> findTwoListByRestaurantId(Long id);
}
