package com.jarvis.diancanba.manager.service;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbMonthbill;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MonthbillService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<DcbMonthbill> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(DcbMonthbill monthbill);
	
	
	/**
	 * 修改
	 */
	public void update(DcbMonthbill monthbill);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public DcbMonthbill findOne(Long id);
	
	
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
	public PageResult findPage(DcbMonthbill monthbill, int pageNum, int pageSize);


	public List<DcbMonthbill> show(int year,int month);
}
