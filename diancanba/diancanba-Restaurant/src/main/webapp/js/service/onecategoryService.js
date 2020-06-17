//服务层
app.service('onecategoryService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../onecategory/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../onecategory/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../onecategory/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../onecategory/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../onecategory/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../onecategory/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../onecategory/search.do?page='+page+"&rows="+rows, searchEntity);
	}
	//根据店铺id查询一级分类列表
	this.findByRestaurantId=function(){

		return $http.get('../onecategory/findOneCategoryList.do');
	}
});
