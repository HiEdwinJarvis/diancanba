package com.jarvis.diancanba.restaurant.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbTwocategoryMapper;
import com.jarvis.diancanba.base.pojo.DcbTwocategory;
import com.jarvis.diancanba.base.pojo.DcbTwocategoryExample;
import com.jarvis.diancanba.restaurant.service.TwocategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class TwocategoryServiceImpl implements TwocategoryService {

	@Autowired
	private DcbTwocategoryMapper twocategoryMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbTwocategory> findAll() {
		return twocategoryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<DcbTwocategory> page=   (Page<DcbTwocategory>) twocategoryMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(DcbTwocategory twocategory) {
		twocategoryMapper.insert(twocategory);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(DcbTwocategory twocategory){
		twocategoryMapper.updateByPrimaryKey(twocategory);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbTwocategory findOne(Long id){
		return twocategoryMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			twocategoryMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(DcbTwocategory twocategory, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbTwocategoryExample example=new DcbTwocategoryExample();
		DcbTwocategoryExample.Criteria criteria = example.createCriteria();
		
		if(twocategory!=null){
			if(twocategory.getDcbRestaurantid()!=0 && twocategory.getDcbRestaurantid()>0){
				criteria.andDcbRestaurantidEqualTo(twocategory.getDcbRestaurantid());
			}
						if(twocategory.getDcbTwocategoryname()!=null && twocategory.getDcbTwocategoryname().length()>0){
				criteria.andDcbTwocategorynameLike("%"+twocategory.getDcbTwocategoryname()+"%");
			}
			if(twocategory.getDcbTwocategorydesc()!=null && twocategory.getDcbTwocategorydesc().length()>0){
				criteria.andDcbTwocategorydescLike("%"+twocategory.getDcbTwocategorydesc()+"%");
			}
			if(twocategory.getDcbTwocategorypicture()!=null && twocategory.getDcbTwocategorypicture().length()>0){
				criteria.andDcbTwocategorypictureLike("%"+twocategory.getDcbTwocategorypicture()+"%");
			}
	
		}
		
		Page<DcbTwocategory> page= (Page<DcbTwocategory>)twocategoryMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<DcbTwocategory> findTwoListByRestaurantId(Long id) {

		DcbTwocategoryExample example = new DcbTwocategoryExample();
		DcbTwocategoryExample.Criteria criteria = example.createCriteria();
		criteria.andDcbRestaurantidEqualTo(id);
		List<DcbTwocategory> dcbTwocategories = twocategoryMapper.selectByExample(example);

		return dcbTwocategories;
	}

}
