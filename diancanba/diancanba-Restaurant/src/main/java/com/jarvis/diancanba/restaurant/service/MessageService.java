package com.jarvis.diancanba.restaurant.service;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbMessage;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MessageService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<DcbMessage> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(DcbMessage message);
	
	
	/**
	 * 修改
	 */
	public void update(DcbMessage message);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public DcbMessage findOne(Long id);
	
	
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
	public PageResult findPage(DcbMessage message, int pageNum, int pageSize);
	
}
