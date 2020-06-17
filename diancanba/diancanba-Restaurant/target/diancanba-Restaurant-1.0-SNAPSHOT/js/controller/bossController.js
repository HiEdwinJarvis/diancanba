 //控制层 
app.controller('bossController' ,function($scope,$controller   ,bossService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		bossService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}
	$scope.bossAndRestaurnat={boss:{},restaurant:{}};

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
			bossService.add( $scope.bossAndRestaurnat  ).success(
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

	$scope.add=function(bossAndRestaurnat){

		$scope.bossAndRestaurnat.boss.dcbBossheadimg = document.getElementById("picName").value;

		bossService.add(bossAndRestaurnat).success(

			function(response){
				alert(response.message);
			}
		)
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
    
});	
