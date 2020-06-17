 //控制层 
app.controller('twocategoryController' ,function($scope,$controller   ,twocategoryService,onecategoryService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		twocategoryService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	var restaurantId =null;
	//分页
	$scope.findPage=function(page,rows){			
		twocategoryService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;
				restaurantId = list(0).dcbRestaurantid;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		twocategoryService.findOne(id).success(
			function(response){
				$scope.entity= response;

			}
		);
		twocategoryService.findByRestaurantId().success(

			function(response){

				$scope.oneCategorylist = response;

			}
		)
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.dcbTwocategoryid!=null){//如果有ID
			serviceObject=twocategoryService.update( $scope.entity ); //修改  
		}else{
			serviceObject=twocategoryService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		twocategoryService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];

				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		twocategoryService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数


			}			
		);
		onecategoryService.findByRestaurantId().success(

			function(response){

				$scope.oneCategorylist = response;

			}
		)
	}


});	
