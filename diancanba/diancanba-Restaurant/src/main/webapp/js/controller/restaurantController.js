 //控制层 
app.controller('restaurantController' ,function($scope,$controller   ,restaurantService){	
	
	$controller('baseController',{$scope:$scope});//继承
	

	
	//查询实体 
	$scope.findOne=function(id){				
		restaurantService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
			restaurantService.update( $scope.entity ).success(
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
	
	 

	//显示本店铺的链接

	$scope.showHref = function(){
		var li ="";
		restaurantService.showHref().success(
			function(response){
				/*
				* 生成二维码
				* 手机端入口
				* 扫码进入每家商店
				* */
				var qr=new QRious({
					element:document.getElementById('qrious'),
					size:250,
					value: response,
					level:'H'
				});
				li = response;
				//alert(li);
				$scope.lianjie = response;
			}
		)



		//生成二维码

	}


});	
