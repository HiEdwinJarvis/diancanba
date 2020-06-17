//服务层
app.service('monthbillService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../monthbill/findAll.do');
	}
	//分页
	this.findPage=function(page,rows){
		return $http.get('../monthbill/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../monthbill/findOne.do?id='+id);
	}
	//增加
	this.add=function(entity){
		return  $http.post('../monthbill/add.do',entity );
	}
	//修改
	this.update=function(entity){
		return  $http.post('../monthbill/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../monthbill/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../monthbill/search.do?page='+page+"&rows="+rows, searchEntity);
	}

	//
	this.show = function(year,month){
		return $http.get('../monthbill/show.do?year='+year+"&month="+month);
	}
});
