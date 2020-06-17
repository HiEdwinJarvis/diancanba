package com.jarvis.diancanba.user.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbFoodMapper;
import com.jarvis.diancanba.base.pojo.DcbFood;
import com.jarvis.diancanba.base.pojo.DcbFoodExample;
import com.jarvis.diancanba.user.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private DcbFoodMapper foodMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbFood> findAll() {
		return foodMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbFood> page=   (Page<DcbFood>) foodMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbFood findOne(Long id){
		return foodMapper.selectByPrimaryKey(id);
	}


	
	
		@Override
	public PageResult findPage(DcbFood food, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbFoodExample example=new DcbFoodExample();
		DcbFoodExample.Criteria criteria = example.createCriteria();
		
		if(food!=null){

			if(food.getDcbRestaurantid()!=null && food.getDcbRestaurantid()>0){
				criteria.andDcbRestaurantidEqualTo(food.getDcbRestaurantid());
			}
			if(food.getDcbTwocategoryid()!=null && food.getDcbTwocategoryid()>0){
				criteria.andDcbTwocategoryidEqualTo(food.getDcbTwocategoryid());
			}
						if(food.getDcbFoodname()!=null && food.getDcbFoodname().length()>0){
				criteria.andDcbFoodnameLike("%"+food.getDcbFoodname()+"%");
			}
			if(food.getDcbFooddesc()!=null && food.getDcbFooddesc().length()>0){
				criteria.andDcbFooddescLike("%"+food.getDcbFooddesc()+"%");
			}
			if(food.getDcbFoodpicture()!=null && food.getDcbFoodpicture().length()>0){
				criteria.andDcbFoodpictureLike("%"+food.getDcbFoodpicture()+"%");
			}
			if(food.getDcbFoodishot()!=null){
				criteria.andDcbFoodishotEqualTo(food.getDcbFoodishot());
			}
			if(food.getDcbFoodproperty1()!=null && food.getDcbFoodproperty1().length()>0){
				criteria.andDcbFoodproperty1Like("%"+food.getDcbFoodproperty1()+"%");
			}
			if(food.getDcbFoodproperty2()!=null && food.getDcbFoodproperty2().length()>0){
				criteria.andDcbFoodproperty2Like("%"+food.getDcbFoodproperty2()+"%");
			}
	
		}
		
		Page<DcbFood> page= (Page<DcbFood>)foodMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
