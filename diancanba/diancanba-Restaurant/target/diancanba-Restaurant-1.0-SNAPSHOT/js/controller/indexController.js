//首页控制器
app.controller('indexController',function($scope,loginService){
	$scope.showName=function(){
			loginService.showName().success(
					function(response){
						$scope.loginName=response.loginName;
					}
			);
	}

	$scope.showPicture = function(){
		loginService.showPicture().success(
			function(response){
				$scope.loginPicture = response.picture;
			}
		)
	}
});