package com.jarvis.diancanba.restaurant.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbDaybillMapper;
import com.jarvis.diancanba.base.mapper.DcbMonthbillMapper;
import com.jarvis.diancanba.base.pojo.DcbMonthbill;
import com.jarvis.diancanba.base.pojo.DcbMonthbillExample;

import com.jarvis.diancanba.restaurant.service.MonthbillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MonthbillServiceImpl implements MonthbillService {

	@Autowired
	private DcbMonthbillMapper monthbillMapper;


	@Override
	public List<DcbMonthbill> findMonthByrestaurant(Long restaurantId,int year) {

		DcbMonthbillExample example = new DcbMonthbillExample();
		DcbMonthbillExample.Criteria criteria = example.createCriteria();
		criteria.andDcbRestaurantidEqualTo(restaurantId);
		criteria.andDcbMonthbillstatusEqualTo(year);
		List<DcbMonthbill> dcbMonthbills = monthbillMapper.selectByExample(example);


		return dcbMonthbills;
	}
}
