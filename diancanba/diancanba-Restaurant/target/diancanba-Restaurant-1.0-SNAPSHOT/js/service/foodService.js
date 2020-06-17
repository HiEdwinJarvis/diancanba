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

	//显示提交的单子
	this.showList = function(){

		return $http.get('../food/showList.do');
	}

	//处理
	this.deal = function(id){
		return $http.get('../food/deal.do?id='+id)
	}
});
