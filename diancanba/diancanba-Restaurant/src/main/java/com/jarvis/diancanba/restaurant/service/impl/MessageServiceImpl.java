package com.jarvis.diancanba.restaurant.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbMessageMapper;
import com.jarvis.diancanba.base.pojo.DcbMessage;
import com.jarvis.diancanba.base.pojo.DcbMessageExample;

import com.jarvis.diancanba.restaurant.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private DcbMessageMapper messageMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<DcbMessage> findAll() {
		return messageMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<DcbMessage> page=   (Page<DcbMessage>) messageMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(DcbMessage message) {
		messageMapper.insert(message);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(DcbMessage message){
		messageMapper.updateByPrimaryKey(message);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public DcbMessage findOne(Long id){
		return messageMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			messageMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(DcbMessage message, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DcbMessageExample example=new DcbMessageExample();
		DcbMessageExample.Criteria criteria = example.createCriteria();
		
		if(message!=null){			
						if(message.getDcbMessage()!=null && message.getDcbMessage().length()>0){
				criteria.andDcbMessageLike("%"+message.getDcbMessage()+"%");
			}
	
		}
		
		Page<DcbMessage> page= (Page<DcbMessage>)messageMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
