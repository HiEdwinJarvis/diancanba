 //控制层 
app.controller('showListController' ,function($scope,$controller,$interval   ,foodService){
	
	$controller('baseController',{$scope:$scope});//继承

	var arr = ["未处理"]
	$interval(function(){$scope.showList();},1000,10000);

	//读取列表数据绑定到表单中
	$scope.showList=function(){
		foodService.showList().success(
			function(response){
				$scope.pojo=response;
			}			
		);
	}


	//处理
	$scope.deal = function(id){

		foodService.deal(id).success(

			function(response){
				//mini.alert("cheng1");
				//window.location.refresh();
				//重新查询
				$scope.reloadList();//重新加载

			}
		)
	}
	

});	
