package com.jarvis.diancanba.manager.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbBossMapper;
import com.jarvis.diancanba.base.pojo.DcbBoss;
import com.jarvis.diancanba.base.pojo.DcbBossExample;
import com.jarvis.diancanba.manager.service.BossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BossServiceImpl implements BossService {

	@Autowired
	private DcbBossMapper bossMapper;
	
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
			//查找状态为1的用户列表

				criteria.andDcbBossstatusEqualTo(0);



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
	public PageResult findPageStatus(DcbBoss boss, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		DcbBossExample example=new DcbBossExample();
		DcbBossExample.Criteria criteria = example.createCriteria();

		if(boss!=null){
			//查找状态为1的用户列表

			criteria.andDcbBossstatusEqualTo(1);



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

}
