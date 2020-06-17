//服务层
app.service('bossService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../boss/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../boss/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../boss/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../boss/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../boss/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../boss/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../boss/search.do?page='+page+"&rows="+rows, searchEntity);
	}
	//通过审核
	this.pass=function(bossid){
		return $http.get('../boss/pass.do?bossid='+bossid);
	}
	//审核驳回
	this.back=function(bossid){
		return $http.get('../boss/back.do?bossid='+bossid);
	}
	//根据bossid查找restaurant
	this.findRestaurantByBossId=function(bossId){
		return $http.get('../boss/findRestaurantByBossId.do?bossId='+bossId);
	}

	//查找所有已通过审核的boss
	this.findBossList=function(page,rows){
		return $http.get('../boss/findBossList.do?page='+page+'&rows='+rows);
	}
});
