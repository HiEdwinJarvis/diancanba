package com.jarvis.diancanba.restaurant.service.impl;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.entity.ShowList;
import com.jarvis.diancanba.base.mapper.DcbDaybillMapper;
import com.jarvis.diancanba.base.pojo.DcbDaybill;
import com.jarvis.diancanba.base.pojo.DcbDaybillExample;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.restaurant.service.DaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DaybillServiceImpl implements DaybillService {

	@Autowired
	private DcbDaybillMapper daybillMapper;

	@Autowired
	private RedisTemplate redisTemplate;


	/**
	 * 查询全部
	 */
	@Override
	public List<DcbDaybill> findAll() {
		return daybillMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbDaybill> page=   (Page<DcbDaybill>) daybillMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(DcbDaybill daybill) {
		daybillMapper.insert(daybill);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(DcbDaybill daybill){
		daybillMapper.updateByPrimaryKey(daybill);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbDaybill findOne(Long id){
		return daybillMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			daybillMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(DcbDaybill daybill, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbDaybillExample example=new DcbDaybillExample();
		DcbDaybillExample.Criteria criteria = example.createCriteria();
		
		if(daybill!=null){			
						if(daybill.getDcbRestaurantid()!=null){
				criteria.andDcbRestaurantidEqualTo(daybill.getDcbRestaurantid());
			}
			if(daybill.getDcbBillproperty1()!=null && daybill.getDcbBillproperty1().length()>0){
				criteria.andDcbBillproperty1Like("%"+daybill.getDcbBillproperty1()+"%");
			}
			if(daybill.getDcbBillproperty2()!=null && daybill.getDcbBillproperty2().length()>0){
				criteria.andDcbBillproperty2Like("%"+daybill.getDcbBillproperty2()+"%");
			}
	
		}
		
		Page<DcbDaybill> page= (Page<DcbDaybill>)daybillMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public Result huizong(DcbRestaurant restaurant) {
		Float money =0f;
		try {
			System.out.println("000000000"+restaurant.getDcbRestaurantid());
			List values = redisTemplate.boundHashOps(restaurant.getDcbRestaurantid().toString()).values();
			System.out.println("valuesSize="+values.size());
			System.out.println(values);
			for (int i = 0; i < values.size(); i++) {

				String str = (String) values.get(i);
				System.out.println("-------------"+str);
				ShowList showList = (ShowList) JSON.parseObject(str, ShowList.class);
				//只显示未处理的单子
				if (showList.getStatus() == 1) {
					System.out.println("=====>"+showList.getMoney());
					money += showList.getMoney();

				}


			}
			System.out.println("mongey"+money);
			DcbDaybill daybill = new DcbDaybill();
			daybill.setDcbRestaurantid(restaurant.getDcbRestaurantid());
			daybill.setDcbDate(new Date());
			daybill.setDcbSummoney(money);
			daybill.setDcbDaybilldate(new Date());
			daybill.setDcbRestaurantname(restaurant.getDcbRestaurantname());
			daybillMapper.insert(daybill);
			redisTemplate.delete(restaurant.getDcbRestaurantid().toString());
			return new Result(true,"汇总完成");
		}catch(Exception e){
return new Result(false,"操作失败");
		}


	}

	@Override
	public List<DcbDaybill> findByRest(Long id) {

		DcbDaybillExample example=new DcbDaybillExample();
		DcbDaybillExample.Criteria criteria = example.createCriteria();
		criteria.andDcbRestaurantidEqualTo(id);

		List<DcbDaybill> dcbDaybills = daybillMapper.selectByExample(example);


		return dcbDaybills;
	}

}
