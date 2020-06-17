package com.jarvis.diancanba.user.controller;

import com.jarvis.diancanba.base.entity.PageResult;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.base.pojo.DcbContent;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.common.utils.CookieUtil;
import com.jarvis.diancanba.user.service.ContentService;
import com.jarvis.diancanba.user.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@Autowired
	private RestaurantService restaurantService;



	@Autowired
	private HttpServletRequest request;

	@Autowired
	private HttpServletResponse response;

	@RequestMapping("/findContentByRestaurant")
	public List<DcbContent> findContentByRestaurant(String restaurantId){


		System.out.println("=================1"+restaurantId);
		if(restaurantId==null || restaurantId==""){//页面跳转情况

			restaurantId=CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");
			System.out.println("=======================2"+restaurantId);

		}

		long restId = Long.valueOf(restaurantId);
		List<DcbContent> byRestaurantId = contentService.findByRestaurantId(restId);

		List<DcbContent> contentList = new ArrayList<>();


		if(byRestaurantId.size()>=3){
			for(int i =byRestaurantId.size()-1 , j=0;i>=0 && j<=3;i--,j++){

				contentList.add(byRestaurantId.get(i));
			}
			return contentList;
		}else{
			return byRestaurantId;
		}




	}
	

}
