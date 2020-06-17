//控制层
app.controller('noteController' ,function($scope,$controller,$location   ,foodService,twocategoryService,onecategoryService){

	$controller('baseController',{$scope:$scope});//继承
	$scope.foodId = $location.search()['foodId'];

	$scope.tableNum = 1;


	//查询页面所需内容
	$scope.show= function(){
		//查看清单列表
		foodService.findList().success(
			function(response){
				$scope.activeFoodList =response;
			}
		)
		foodService.showPad().success(

			function(response){
				$scope.padList = response;
			}
		)

	}

	$scope.delete = function(foodId){

		foodService.deleteByfoodId(foodId).success(

			function(response){

				$scope.activeFoodList =response;
				$scope.reloadList();//重新加载
			}
		)
	}

	//提交付款的单子
	$scope.pay = function(tableNum,remark){

		foodService.pay(tableNum,remark).success(

			function(response){
			    alert(response.message);
				$scope.reloadList();//重新加载
			}
		)
	}



});	
