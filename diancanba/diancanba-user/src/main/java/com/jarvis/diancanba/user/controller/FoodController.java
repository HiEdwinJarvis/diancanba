package com.jarvis.diancanba.user.controller;

import com.alibaba.fastjson.JSON;
import com.jarvis.diancanba.base.entity.*;
import com.jarvis.diancanba.base.pojo.DcbFood;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;
import com.jarvis.diancanba.base.pojo.DcbTwocategory;
import com.jarvis.diancanba.common.utils.CookieUtil;
import com.jarvis.diancanba.user.service.FoodService;
import com.jarvis.diancanba.user.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private FoodService foodService;

	@Autowired
	private RestaurantService restaurantService;

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private HttpServletResponse response;


	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return foodService.findPage(page, rows);
	}
	

	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public DcbFood findOne(Long id){
		return foodService.findOne(id);		
	}
	

	

	@RequestMapping("/search")
	public PageResult search(@RequestBody DcbFood food, int page, int rows  ){


		String restaurantId = CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");
		food.setDcbRestaurantid(Long.valueOf(restaurantId));

		System.out.println("twoCategoryId === "+food.getDcbTwocategoryid());
		return foodService.findPage(food, page, rows);		
	}
	@RequestMapping("/findByIsHot")
	public PageResult findByIsHot(String restaurantId){

		if(restaurantId==null || restaurantId==""){//页面跳转情况

			restaurantId=CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");

		}

		long restId = Long.valueOf(restaurantId);


		DcbFood food = new DcbFood();
		food.setDcbRestaurantid(restId);
		food.setDcbFoodishot(1);
		return foodService.findPage(food,1,6);

	}

	//菜单页显示该商家的菜单菜品
	@RequestMapping("/findByRestaurant")
	public PageResult findByRestaurant( int page, int rows,String twocategory){



		String restaurantId = CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");
		DcbFood food = new DcbFood();
		food.setDcbRestaurantid(Long.valueOf(restaurantId));
		food.setDcbTwocategoryid(Long.valueOf(twocategory));
		return foodService.findPage(food,page,rows);



	}

	/**
	 * 根据二级分类查找商品
	 * 两个限制条件
	 * 1.restaurantId
	 * 2.twoCategoryId
	 */
	@RequestMapping("/findBytwoCategory")
	public PageResult findBytwoCategory(String twoCategoryId,int page, int rows){
		String restaurantId = CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");
		DcbFood food = new DcbFood();
		food.setDcbRestaurantid(Long.valueOf(restaurantId));
		food.setDcbTwocategoryid(Long.valueOf(twoCategoryId));
		return foodService.findPage(food,page,rows);

	}


	@Autowired
	private RedisTemplate redisTemplate;

	@RequestMapping("/test")
	public void dd(){
		redisTemplate.boundHashOps("test").put("a","a");

	}

	@RequestMapping("/get")
	public String getTest(String uuid){

		return (String)redisTemplate.boundHashOps("test").get(uuid);
	}

	@RequestMapping("/get2")
	public String getTest2(String uuid){

		return (String)redisTemplate.boundHashOps("1").get(uuid);
	}

	/**
	 * 将商品Id加入到redis中，待购买清单
	 * */
	@RequestMapping("/andList")
	public Result andList(String foodId,String num){
		//先得到未添加的列表
		String foodList = CookieUtil.getCookieValue(request,
                "foodList", "UTF-8");
		//判断如果之前未添加，
		int num1 = Integer.valueOf(num);
        System.out.println("++++"+foodList);
        //吧新的的列表组合赋值给
		NoteList noteList = new NoteList();
        DcbFood one = foodService.findOne(Long.valueOf(foodId));
        Note note = new Note();
        note.setFoodId(one.getDcbFoodid());
        note.setFoodName(one.getDcbFoodname());
        note.setNum(num1);
        note.setPrice(one.getDcbFoodprice());
        //System.out.println(" ===="+noteList.getNoteList());
		List<Note> noteList1 = new ArrayList<>();
		if(foodList==null || foodList=="") {
			noteList1.add(note);
			noteList.setMoney(note.getPrice()*note.getNum());
		}else{
			noteList = (NoteList)JSON.parseObject(foodList, NoteList.class);
			noteList1 = noteList.getNoteList();
			System.out.println("!!!"+noteList1);
			noteList1.add(note);
			noteList.setMoney(noteList.getMoney()+note.getPrice()*note.getNum());
		}
		//状态改为0,为付款
		noteList.setStatus(0);
        noteList.setNoteList(noteList1);
		System.out.println("---==="+noteList);
        String str = JSON.toJSONString(noteList);
        System.out.println("str"+str);

        try {
			CookieUtil.setCookie(request, response, "foodList", str,
                    3600 * 24, "UTF-8");
			return new Result(true,"已加入待付款清单");
		}catch (Exception e){
			return new Result(false,"发生了未知错误");
		}

	}

	/**
	 * 查询加入到清单的列表
	 * */
	@RequestMapping("/findList")
	public NoteList findList(){

		String foodString = CookieUtil.getCookieValue(request, "foodList", "UTF-8");
		System.out.println("-----"+foodString);
		NoteList noteList = (NoteList)JSON.parseObject(foodString,NoteList.class);



		return noteList;
	}

	/**
	 * 移除列表中的项
	 * */
	@RequestMapping("/deleteByfoodId")
	public NoteList deleteByfoodId(String foodId){
		String foodList = CookieUtil.getCookieValue(request, "foodList", "UTF-8");

		NoteList noteList = (NoteList)JSON.parseObject(foodList,NoteList.class);

		for(int i = 0 ; i< noteList.getNoteList().size();i++){
			if(Long.valueOf(foodId)==noteList.getNoteList().get(i).getFoodId()){
				Float price = noteList.getNoteList().get(i).getNum()*
                        noteList.getNoteList().get(i).getPrice();
				noteList.getNoteList().remove(i);
				noteList.setMoney(noteList.getMoney()-price);
			}
		}
		String str = JSON.toJSONString(noteList);
		CookieUtil.setCookie(request, response, "foodList",
                str, 3600 * 24, "UTF-8");
		return noteList;
	}

	/**
     * 付款提交的单子
     * */
	@RequestMapping("/pay")
    public Result pay(String tableNum,String remark){
		System.out.println("备注信息："+remark);
		System.out.println("1"+tableNum);
		String foodList = CookieUtil.getCookieValue(request, "foodList", "UTF-8");
		System.out.println("2"+foodList);
		NoteList noteList = (NoteList)JSON.parseObject(foodList,NoteList.class);

		String restaurantId = CookieUtil.getCookieValue(request,
                "restaurantId", "UTF-8");

		System.out.println("3"+restaurantId);
		noteList.setStatus(1);
		noteList.setRemark(remark);//天机备注信息
		//将状态更新
		String str1 = JSON.toJSONString(noteList);
		System.out.println(str1+"str1");

		//先获得之前的已交互付过款的列表
		String payed = CookieUtil.getCookieValue(request,
                "payed", "UTF-8");
		if(payed==null || payed=="") {
			//将已经付过款的foodList列表直接迁入到payed
			CookieUtil.setCookie(request, response,
                    "payed", str1, 3600 * 24, "UTF-8");
		}else{//如果之前的不为空，则说明是二次点餐或者更多次，则要将数据合并
			//获得之前已经付过款的单子，合并
			String paylist  = hebing(payed,str1);
			CookieUtil.setCookie(request, response,
                    "payed", paylist, 3600 * 24, "UTF-8");
		}

		//foodList修改为“”
		CookieUtil.setCookie(request, response, "foodList",
                "", 3600 * 24, "UTF-8");

		ShowList showList = new ShowList();
		showList.setStatus(0);//未做
		showList.setMoney(noteList.getMoney());//此单金额
		showList.setRestausrantId(Long.valueOf(restaurantId));
		showList.setTableNum(Integer.valueOf(tableNum));
		showList.setRemark(remark);//添加备注信息
		showList.setNoteList(noteList.getNoteList());
		String uuid = UUID.randomUUID().toString();
		showList.setId(uuid);
		CookieUtil.setCookie(request, response, "uuid",
                uuid, 3600 * 24, "UTF-8");

		System.out.println(uuid);
		String str = JSON.toJSONString(showList);

		//将已经付款的单子加入到redis	中，供给餐馆方查看，厨师根据单子做饭
		try {
			redisTemplate.boundHashOps(restaurantId).put(uuid, str);

			/*
			* 为了防止人恶意评价餐馆，
			* 让每个付了款的人只能评论一次，
			* 给付款了的人的cookie里加一个属性，IsComment为1：为已付款的，使该用户可以评论
			*
			* */

			CookieUtil.setCookie(request, response, "IsComment",
                    "1", 3600 * 24, "UTF-8");

			return new Result(true,"提交成功");
		}catch (Exception e){
			return new Result(false,"提交失败");
		}




	}

	/*
	* 增加将已经付过款的列表和新的列表分开显示
	*
	*
	* 此方法显示已经付过款的单子
	* */

	@RequestMapping("/showPayed")
	public NoteList showPayed(){

		String foodString = CookieUtil.getCookieValue(request, "payed", "UTF-8");
		System.out.println("-----"+foodString);
		NoteList noteList = (NoteList)JSON.parseObject(foodString,NoteList.class);



		return noteList;
	}


	//合并两个noteList
	public String hebing(String s1,String s2){
		NoteList noteList1 = (NoteList)JSON.parseObject(s1,NoteList.class);

		NoteList noteList2 =  (NoteList)JSON.parseObject(s2,NoteList.class);

		List<Note> noteList = noteList1.getNoteList();
		noteList2.setMoney(noteList2.getMoney()+noteList1.getMoney());
		noteList2.setStatus(1);

		for(Note note:noteList){
			noteList2.getNoteList().add(note);
		}


		return JSON.toJSONString(noteList2);

	}




}
