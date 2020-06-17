package com.jarvis.diancanba.manager.service;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbBoss;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface BossService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<DcbBoss> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(DcbBoss boss);
	
	
	/**
	 * 修改
	 */
	public void update(DcbBoss boss);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public DcbBoss findOne(String id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(DcbBoss boss, int pageNum, int pageSize);


	/**
	 * 查找所有审核已过的boss
	 *
	 */
	public PageResult findPageStatus(DcbBoss boss, int pageNum, int pageSize);



}
