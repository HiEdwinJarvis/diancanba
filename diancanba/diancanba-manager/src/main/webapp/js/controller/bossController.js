 //控制层 
app.controller('bossController' ,function($scope,$controller   ,bossService,restaurantService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		bossService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		bossService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		bossService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=bossService.update( $scope.entity ); //修改  
		}else{
			serviceObject=bossService.add( $scope.entity  );//增加 
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
		bossService.dele( $scope.selectIds ).success(
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
		bossService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	//根据bossid查找相应的店铺信息
	$scope.findRestaurantByBossId=function(bossid){
		bossService.findRestaurantByBossId(bossid).success(
			function(response){

				$scope.restaurant = response;
			}

		)
	}

	//通过审核
	$scope.pass = function(bossid){
		bossService.pass(bossid).success(

			function(response){
				alert(response.message);
				$scope.reloadList();//重新加载
			}
		)
	}
	//驳回审核
	$scope.back=function(bossid){
		bossService.back(bossid).success(

			function(response){
				alert(response.message);
				$scope.reloadList();//重新加载
			}
		)

	}

	$scope.findBossList=function(page,rows){
		bossService.findBossList(page,rows).success(

			function(response){
				$scope.list=response.rows;
				$scope.paginationConf.totalItems=response.total;//更新总记
			}
		)
	}
    
});	
