package com.jarvis.diancanba.manager.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbMonthbillMapper;
import com.jarvis.diancanba.base.pojo.DcbMonthbill;
import com.jarvis.diancanba.base.pojo.DcbMonthbillExample;
import com.jarvis.diancanba.manager.service.MonthbillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MonthbillServiceImpl implements MonthbillService {

	@Autowired
	private DcbMonthbillMapper monthbillMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbMonthbill> findAll() {
		return monthbillMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbMonthbill> page=   (Page<DcbMonthbill>) monthbillMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(DcbMonthbill monthbill) {
		monthbillMapper.insert(monthbill);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(DcbMonthbill monthbill){
		monthbillMapper.updateByPrimaryKey(monthbill);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbMonthbill findOne(Long id){
		return monthbillMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			monthbillMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(DcbMonthbill monthbill, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbMonthbillExample example=new DcbMonthbillExample();
		DcbMonthbillExample.Criteria criteria = example.createCriteria();
		System.out.println("月份:="+monthbill.getDcbMonth()+"年份"+monthbill.getDcbMonthbillstatus());
		if(monthbill!=null){			

			if(monthbill.getDcbMonth()!=0 && monthbill.getDcbMonth()>0){
				criteria.andDcbMonthEqualTo(monthbill.getDcbMonth());
			}
			if(monthbill.getDcbMonthbillstatus()!=0 && monthbill.getDcbMonthbillstatus()>0){
				criteria.andDcbMonthbillstatusEqualTo(monthbill.getDcbMonthbillstatus());
			}
	
		}
		
		Page<DcbMonthbill> page= (Page<DcbMonthbill>)monthbillMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<DcbMonthbill> show(int year, int month) {

		DcbMonthbillExample example=new DcbMonthbillExample();
		DcbMonthbillExample.Criteria criteria = example.createCriteria();
		System.out.println("月份:="+year+"年份"+month);


				criteria.andDcbMonthEqualTo(month);
				criteria.andDcbMonthbillstatusEqualTo(year);

		return monthbillMapper.selectByExample(example);
	}


}
