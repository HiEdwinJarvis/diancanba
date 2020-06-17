 //控制层 
app.controller('onecategoryController' ,function($scope,$controller   ,onecategoryService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		onecategoryService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		onecategoryService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		onecategoryService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){



		var serviceObject;//服务层对象  				
		if($scope.entity.dcbOnecategoryid!=null){//如果有ID
			if(document.getElementById("picName").value!=""){
				$scope.entity.dcbOnecategorypicture =document.getElementById("picName").value;
			}

			serviceObject=onecategoryService.update( $scope.entity ); //修改



		}else{

			$scope.entity.dcbOnecategorypicture = document.getElementById("picName").value;

			serviceObject=onecategoryService.add( $scope.entity  );//增加
			//document.getElementById("picName").value=null;
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
		onecategoryService.dele( $scope.selectIds ).success(
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
		onecategoryService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	//清空dropzone
	$scope.qingkong=function(){

		var drop  = document.getElementById("dropz");
		drop.outerHTML = drop.outerHTML;

	}
    
});	
