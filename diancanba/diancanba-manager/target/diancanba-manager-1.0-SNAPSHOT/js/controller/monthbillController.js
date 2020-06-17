 //控制层 
app.controller('monthbillController' ,function($scope,$controller   ,monthbillService){	
	
	$controller('baseController',{$scope:$scope});//继承


	$scope.year = 2020;
	$scope.month = 1;
	$scope.fen = 0;

	$scope.show = function(a,b){
		monthbillService.show(a,b).success(
			function(response){
				$scope.list = response;
			}
		)
	}
});	
