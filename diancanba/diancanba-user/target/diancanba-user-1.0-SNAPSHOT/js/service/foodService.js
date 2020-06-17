//服务层
app.service('foodService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../food/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../food/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../food/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../food/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../food/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../food/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../food/search.do?page='+page+"&rows="+rows, searchEntity);
	}

	//查询推荐菜
	this.findByIsHot=function(restaurantId){
		return $http.get('../food/findByIsHot.do?restaurantId='+restaurantId);
	}

	//该饭馆的菜单显示
	this.findByRestaurantId = function(page,rows,twocategory){
		return $http.get('../food/findByRestaurant.do?page='+page+'&rows='+rows+'&twocategory='+twocategory);
	}

	//按二级分类查找
	this.findBytwoCategory = function(twoCategory,page,rows){
		return $http.get('../food/findBytwoCategory.do?twoCategoryId='+twoCategory+'&page='+page+'&rows='+rows);
	}

	//加入到购买清单
	this.andList = function(foodId,num){
		return $http.get('../food/andList.do?foodId='+foodId+'&num='+num);
	}

	//查看清单
	this.findList = function(){
		return $http.get('../food/findList.do');
	}

	//移除其中的项
	this.deleteByfoodId = function(foodId){
		return $http.get('../food/deleteByfoodId.do?foodId='+foodId);
	}

	this.andListByFoodId = function(foodId){
		return $http.get('../food/andListByFoodId.do?foodId='+foodId);
	}
	this.pay = function(tableNum,remark){
		return $http.get('../food/pay.do?tableNum='+tableNum+'&remark='+remark);
	}

	//显示已经付过款的单子
	this.showPad = function(){
		return $http.get('../food/showPayed.do');
	}

	//显示轮播图

	this.findContentByRestaurant = function(restaurantId){
		return $http.get('../content/findContentByRestaurant.do?restaurantId='+restaurantId);
	}
});
