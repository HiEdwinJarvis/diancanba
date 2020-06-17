//服务层
app.service('daybillService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../daybill/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../daybill/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../daybill/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../daybill/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../daybill/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../daybill/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../daybill/search.do?page='+page+"&rows="+rows, searchEntity);
	}
	//汇总
	this.huizong=function(){
		return $http.get('../daybill/huizong.do');
	}

	//插叙本月所有营业额
	this.findBill = function(){
		return $http.get('../daybill/findBill.do');
	}
});
