package com.jarvis.diancanba.user.service;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbContent;

import java.util.List;


public interface ContentService {

	public List<DcbContent> findByRestaurantId(Long restaurantId);
}
