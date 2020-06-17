package com.jarvis.diancanba.restaurant.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbDaybillitemMapper;
import com.jarvis.diancanba.base.pojo.DcbDaybillitem;
import com.jarvis.diancanba.base.pojo.DcbDaybillitemExample;
import com.jarvis.diancanba.restaurant.service.DaybillitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DaybillitemServiceImpl implements DaybillitemService {

	@Autowired
	private DcbDaybillitemMapper daybillitemMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbDaybillitem> findAll() {
		return daybillitemMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbDaybillitem> page=   (Page<DcbDaybillitem>) daybillitemMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(DcbDaybillitem daybillitem) {
		daybillitemMapper.insert(daybillitem);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(DcbDaybillitem daybillitem){
		daybillitemMapper.updateByPrimaryKey(daybillitem);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbDaybillitem findOne(Long id){
		return daybillitemMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			daybillitemMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(DcbDaybillitem daybillitem, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbDaybillitemExample example=new DcbDaybillitemExample();
		DcbDaybillitemExample.Criteria criteria = example.createCriteria();
		
		if(daybillitem!=null){			
						if(daybillitem.getDcbItemfoodname()!=null && daybillitem.getDcbItemfoodname().length()>0){
				criteria.andDcbItemfoodnameLike("%"+daybillitem.getDcbItemfoodname()+"%");
			}
			if(daybillitem.getDcbFoodpicture()!=null && daybillitem.getDcbFoodpicture().length()>0){
				criteria.andDcbFoodpictureLike("%"+daybillitem.getDcbFoodpicture()+"%");
			}
			if(daybillitem.getDcbDaybillitemtproperty1()!=null && daybillitem.getDcbDaybillitemtproperty1().length()>0){
				criteria.andDcbDaybillitemtproperty1Like("%"+daybillitem.getDcbDaybillitemtproperty1()+"%");
			}
			if(daybillitem.getDcbDaybillitemproperty2()!=null && daybillitem.getDcbDaybillitemproperty2().length()>0){
				criteria.andDcbDaybillitemproperty2Like("%"+daybillitem.getDcbDaybillitemproperty2()+"%");
			}
	
		}
		
		Page<DcbDaybillitem> page= (Page<DcbDaybillitem>)daybillitemMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
