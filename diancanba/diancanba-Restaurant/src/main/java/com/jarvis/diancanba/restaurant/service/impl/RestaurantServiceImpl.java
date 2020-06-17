package com.jarvis.diancanba.restaurant.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbRestaurantMapper;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.base.pojo.DcbRestaurantExample;

import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private DcbRestaurantMapper restaurantMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbRestaurant> findAll() {
		return restaurantMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbRestaurant> page=   (Page<DcbRestaurant>) restaurantMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(DcbRestaurant restaurant) {

		restaurant.setDcbRestaurantdate(new Date());
		restaurantMapper.insert(restaurant);
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(DcbRestaurant restaurant){
		restaurantMapper.updateByPrimaryKey(restaurant);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbRestaurant findOne(Long id){
		return restaurantMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			restaurantMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(DcbRestaurant restaurant, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbRestaurantExample example=new DcbRestaurantExample();
		DcbRestaurantExample.Criteria criteria = example.createCriteria();
		
		if(restaurant!=null){			
						if(restaurant.getDcbBossid()!=null && restaurant.getDcbBossid().length()>0){
				criteria.andDcbBossidLike("%"+restaurant.getDcbBossid()+"%");
			}
			if(restaurant.getDcbRestaurantname()!=null && restaurant.getDcbRestaurantname().length()>0){
				criteria.andDcbRestaurantnameLike("%"+restaurant.getDcbRestaurantname()+"%");
			}
			if(restaurant.getDcbRestauranttel()!=null && restaurant.getDcbRestauranttel().length()>0){
				criteria.andDcbRestauranttelLike("%"+restaurant.getDcbRestauranttel()+"%");
			}
			if(restaurant.getDcbRestaurantdesc()!=null && restaurant.getDcbRestaurantdesc().length()>0){
				criteria.andDcbRestaurantdescLike("%"+restaurant.getDcbRestaurantdesc()+"%");
			}
			if(restaurant.getDcbRestaurantaddress()!=null && restaurant.getDcbRestaurantaddress().length()>0){
				criteria.andDcbRestaurantaddressLike("%"+restaurant.getDcbRestaurantaddress()+"%");
			}
			if(restaurant.getDcbRestauranturl()!=null && restaurant.getDcbRestauranturl().length()>0){
				criteria.andDcbRestauranturlLike("%"+restaurant.getDcbRestauranturl()+"%");
			}
			if(restaurant.getDcbRestaurantpicture()!=null && restaurant.getDcbRestaurantpicture().length()>0){
				criteria.andDcbRestaurantpictureLike("%"+restaurant.getDcbRestaurantpicture()+"%");
			}
			if(restaurant.getDcbRestaurantproperty1()!=null && restaurant.getDcbRestaurantproperty1().length()>0){
				criteria.andDcbRestaurantproperty1Like("%"+restaurant.getDcbRestaurantproperty1()+"%");
			}
			if(restaurant.getDcbRestaurantproperty2()!=null && restaurant.getDcbRestaurantproperty2().length()>0){
				criteria.andDcbRestaurantproperty2Like("%"+restaurant.getDcbRestaurantproperty2()+"%");
			}
	
		}
		
		Page<DcbRestaurant> page= (Page<DcbRestaurant>)restaurantMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public DcbRestaurant findRestaurantbyBossId(String bossId) {
		DcbRestaurantExample example = new DcbRestaurantExample();
		DcbRestaurantExample.Criteria criteria = example.createCriteria();
		criteria.andDcbBossidEqualTo(bossId);
		List<DcbRestaurant> dcbRestaurants = restaurantMapper.selectByExample(example);
		return dcbRestaurants.get(0);
	}

}
