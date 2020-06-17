package com.jarvis.diancanba.restaurant.controller;

import java.util.HashMap;
import java.util.Map;

import com.jarvis.diancanba.base.pojo.DcbBoss;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.restaurant.service.BossService;
import com.jarvis.diancanba.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private BossService bossService;

	@RequestMapping("/name")
	public Map showName(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		Map map=new HashMap();
		map.put("loginName", name);
		return map;		
	}


	@RequestMapping("/picture")
	public Map showPicture(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println(name);
		DcbBoss one = bossService.findOne(name);

		Map map=new HashMap();
		map.put("picture", one.getDcbBossheadimg());
		return map;
	}
	
}
