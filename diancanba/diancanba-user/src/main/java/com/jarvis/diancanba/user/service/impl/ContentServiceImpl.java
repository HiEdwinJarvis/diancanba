package com.jarvis.diancanba.user.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.mapper.DcbContentMapper;
import com.jarvis.diancanba.base.pojo.DcbContent;
import com.jarvis.diancanba.base.pojo.DcbContentExample;
import com.jarvis.diancanba.user.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private DcbContentMapper contentMapper;
	


	@Override
	public List<DcbContent> findByRestaurantId(Long restaurantId) {
		DcbContentExample example = new DcbContentExample();
		DcbContentExample.Criteria criteria = example.createCriteria();

		//根据reastaurantId查询每个餐馆的轮博图
		criteria.andDcbRestaurantidEqualTo(restaurantId);

		List<DcbContent> dcbContents = contentMapper.selectByExample(example);

		return dcbContents;
	}
}
