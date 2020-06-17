package com.jarvis.diancanba.restaurant.service;
import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.pojo.DcbMonthbill;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MonthbillService {

public List<DcbMonthbill> findMonthByrestaurant(Long restaurantId,int year);
}
