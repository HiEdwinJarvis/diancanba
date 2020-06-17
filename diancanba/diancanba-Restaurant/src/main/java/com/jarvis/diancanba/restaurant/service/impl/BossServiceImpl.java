package com.jarvis.diancanba.restaurant.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.BossAndRestaurant;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.mapper.DcbBossMapper;
import com.jarvis.diancanba.base.mapper.DcbRestaurantMapper;
import com.jarvis.diancanba.base.pojo.DcbBoss;
import com.jarvis.diancanba.base.pojo.DcbBossExample;

import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.restaurant.service.BossService;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
@Transactional
public class BossServiceImpl implements BossService {

	@Autowired
	private DcbBossMapper bossMapper;

	@Autowired
	private RestaurantService restaurantService;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbBoss> findAll() {
		return bossMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbBoss> page=   (Page<DcbBoss>) bossMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(DcbBoss boss) {
		//给商家增添默认的属性
		/**
		 * 0,注册了商家的但未注册店铺的状态，平台方未审核
		 * 1，注册了商家切审核通过状态，未注册店铺
		 * 2，注册了商家审核未通过状态
		 * 3，注册了商家审核通过，注测了店铺，未审核状态
		 * 4，注册了商家审核通过，注册了店铺审核未通过状态
		 * 5，注册了商家审核通过，店铺审核也通过状态
		 *
		 */
		boss.setDcbBossstatus(0);
		boss.setDcbCreatetime(new Date());

		bossMapper.insert(boss);
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(DcbBoss boss){
		bossMapper.updateByPrimaryKey(boss);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbBoss findOne(String id){
		return bossMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			bossMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(DcbBoss boss, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbBossExample example=new DcbBossExample();
		DcbBossExample.Criteria criteria = example.createCriteria();
		
		if(boss!=null){			
						if(boss.getDcbBossid()!=null && boss.getDcbBossid().length()>0){
				criteria.andDcbBossidLike("%"+boss.getDcbBossid()+"%");
			}
			if(boss.getDcbBosspassword()!=null && boss.getDcbBosspassword().length()>0){
				criteria.andDcbBosspasswordLike("%"+boss.getDcbBosspassword()+"%");
			}
			if(boss.getDcbBossname()!=null && boss.getDcbBossname().length()>0){
				criteria.andDcbBossnameLike("%"+boss.getDcbBossname()+"%");
			}
			if(boss.getDcbBosstel()!=null && boss.getDcbBosstel().length()>0){
				criteria.andDcbBosstelLike("%"+boss.getDcbBosstel()+"%");
			}
			if(boss.getDcbBossheadimg()!=null && boss.getDcbBossheadimg().length()>0){
				criteria.andDcbBossheadimgLike("%"+boss.getDcbBossheadimg()+"%");
			}
			if(boss.getDcbRestaurantname()!=null && boss.getDcbRestaurantname().length()>0){
				criteria.andDcbRestaurantnameLike("%"+boss.getDcbRestaurantname()+"%");
			}
			if(boss.getDcbBossaddress()!=null && boss.getDcbBossaddress().length()>0){
				criteria.andDcbBossaddressLike("%"+boss.getDcbBossaddress()+"%");
			}
			if(boss.getDcbBossemail()!=null && boss.getDcbBossemail().length()>0){
				criteria.andDcbBossemailLike("%"+boss.getDcbBossemail()+"%");
			}
			if(boss.getDcbBossproperty1()!=null && boss.getDcbBossproperty1().length()>0){
				criteria.andDcbBossproperty1Like("%"+boss.getDcbBossproperty1()+"%");
			}
			if(boss.getDcbBossproperty2()!=null && boss.getDcbBossproperty2().length()>0){
				criteria.andDcbBossproperty2Like("%"+boss.getDcbBossproperty2()+"%");
			}
	
		}
		
		Page<DcbBoss> page= (Page<DcbBoss>)bossMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void register(BossAndRestaurant bossAndRestaurant) {


		add(bossAndRestaurant.getBoss());
		//将boss的id加入到餐馆表中
		bossAndRestaurant.getRestaurant().setDcbBossid(bossAndRestaurant.getBoss().getDcbBossid());
		//餐馆默认状态为0 未审核
		bossAndRestaurant.getRestaurant().setDcbRestaurantstatus(0);
		restaurantService.add(bossAndRestaurant.getRestaurant());

	}

}
