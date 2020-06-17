package com.jarvis.diancanba.user.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbOnecategoryMapper;
import com.jarvis.diancanba.base.pojo.DcbOnecategory;
import com.jarvis.diancanba.base.pojo.DcbOnecategoryExample;
import com.jarvis.diancanba.user.service.OnecategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class OnecategoryServiceImpl implements OnecategoryService {

	@Autowired
	private DcbOnecategoryMapper onecategoryMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbOnecategory> findAll() {
		return onecategoryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbOnecategory> page=   (Page<DcbOnecategory>) onecategoryMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbOnecategory findOne(Long id){
		return onecategoryMapper.selectByPrimaryKey(id);
	}


	
	
		@Override
	public PageResult findPage(DcbOnecategory onecategory, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbOnecategoryExample example=new DcbOnecategoryExample();
		DcbOnecategoryExample.Criteria criteria = example.createCriteria();

		if(onecategory!=null){
			if(onecategory.getDcbRestaurantid()!=0 && onecategory.getDcbRestaurantid()>0){
				criteria.andDcbRestaurantidEqualTo(onecategory.getDcbRestaurantid());
			}
						if(onecategory.getDcbOnecategoryname()!=null && onecategory.getDcbOnecategoryname().length()>0){
				criteria.andDcbOnecategorynameLike("%"+onecategory.getDcbOnecategoryname()+"%");
			}
			if(onecategory.getDcbOnecategorydesc()!=null && onecategory.getDcbOnecategorydesc().length()>0){
				criteria.andDcbOnecategorydescLike("%"+onecategory.getDcbOnecategorydesc()+"%");
			}
			if(onecategory.getDcbOnecategorypicture()!=null && onecategory.getDcbOnecategorypicture().length()>0){
				criteria.andDcbOnecategorypictureLike("%"+onecategory.getDcbOnecategorypicture()+"%");
			}
			if(onecategory.getDcbOnecategoryproperty1()!=null && onecategory.getDcbOnecategoryproperty1().length()>0){
				criteria.andDcbOnecategoryproperty1Like("%"+onecategory.getDcbOnecategoryproperty1()+"%");
			}
			if(onecategory.getDcbOnecategoryproperty2()!=null && onecategory.getDcbOnecategoryproperty2().length()>0){
				criteria.andDcbOnecategoryproperty2Like("%"+onecategory.getDcbOnecategoryproperty2()+"%");
			}

	
		}
		
		Page<DcbOnecategory> page= (Page<DcbOnecategory>)onecategoryMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void deleteById(Long id) {
		  onecategoryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<DcbOnecategory> findListByRestaurant(Long restaurantId) {

		DcbOnecategoryExample example = new DcbOnecategoryExample();
		DcbOnecategoryExample.Criteria criteria = example.createCriteria();
		criteria.andDcbRestaurantidEqualTo(restaurantId);
		List<DcbOnecategory> dcbOnecategories = onecategoryMapper.selectByExample(example);

		return dcbOnecategories;
	}

}
