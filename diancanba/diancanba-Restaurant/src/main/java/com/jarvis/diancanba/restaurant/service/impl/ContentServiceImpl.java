package com.jarvis.diancanba.restaurant.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbContentMapper;
import com.jarvis.diancanba.base.pojo.DcbContent;
import com.jarvis.diancanba.base.pojo.DcbContentExample;

import com.jarvis.diancanba.restaurant.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private DcbContentMapper contentMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbContent> findAll() {
		return contentMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbContent> page=   (Page<DcbContent>) contentMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(DcbContent content) {
		contentMapper.insert(content);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(DcbContent content){
		contentMapper.updateByPrimaryKey(content);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbContent findOne(Long id){
		return contentMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			contentMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(DcbContent content, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbContentExample example=new DcbContentExample();
		DcbContentExample.Criteria criteria = example.createCriteria();
		
		if(content!=null){			
						if(content.getDcbRestaurantid()!=null && content.getDcbRestaurantid()>0){
			criteria.andDcbRestaurantidEqualTo(content.getDcbRestaurantid());

						}
			if(content.getDcbContentpicture()!=null && content.getDcbContentpicture().length()>0){
				criteria.andDcbContentpictureLike("%"+content.getDcbContentpicture()+"%");
			}
			if(content.getDcbContentproperty1()!=null && content.getDcbContentproperty1().length()>0){
				criteria.andDcbContentproperty1Like("%"+content.getDcbContentproperty1()+"%");
			}
			if(content.getDcbContentproperty2()!=null && content.getDcbContentproperty2().length()>0){
				criteria.andDcbContentproperty2Like("%"+content.getDcbContentproperty2()+"%");
			}
	
		}
		
		Page<DcbContent> page= (Page<DcbContent>)contentMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
