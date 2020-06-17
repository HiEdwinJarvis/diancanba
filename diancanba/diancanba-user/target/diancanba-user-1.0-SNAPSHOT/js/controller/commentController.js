//控制层
app.controller('commentController' ,function($scope,$controller,$location   ,commentService){

	$controller('baseController',{$scope:$scope});//继承


	/*
	* 评论功能
	* */
	$scope.pinglun = function(name,content){
		commentService.pinglun(name,content).success(

			function(response){
				alert(response.message);
				$scope.reloadList();//重新加载
			}
		)
	}

	/*
	* 显示
	* */

	$scope.show = function(){

		commentService.show().success(

			function(response){

				$scope.list = response;
			}
		)
	}

});	
