//控制层
app.controller('foodInfoController' ,function($scope,$controller,$location   ,foodService,twocategoryService,onecategoryService){

	$controller('baseController',{$scope:$scope});//继承
	$scope.foodId = $location.search()['foodId'];

	$scope.num=1;
	//数量加减
	$scope.addNum=function(x){
		$scope.num+=x;
		if($scope.num<1){
			$scope.num=1;
		}
	}

	//查询页面所需内容
	$scope.show= function(){
		if($scope.foodId==null){
			$scope.foodId="";
		}
		foodService.findOne($scope.foodId).success(

			function(response){
				$scope.foodInfo = response;

			}
		)
		/*
		* 查询
		* */


		foodService.findByIsHot().success(
			function(response){

				$scope.HotFoodList = response.rows;
			}
		)


	}

	/**
	 * 将选中的菜品和数量
     * 加入到待购买的列表
	 *
     * */
    $scope.andList = function(foodId,num){
        foodService.andList(foodId,num).success(

            function(response){

                alert(response.message);
            }
        )

    }

	//读取列表数据绑定到表单中
	$scope.findAll=function(){
		foodService.findAll().success(
			function(response){
				$scope.list=response;
			}
		);
	}

	//分页
	$scope.findPage=function(page,rows){
		foodService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
				twoCategorylist();
			}
		);
		twocategoryService.findByRestaurantId().success(

			function(response){

				$scope.twoCategorylist = response;

			}
		)
	}

	//查询实体
	$scope.findOne=function(id){
		foodService.findOne(id).success(
			function(response){
				$scope.entity= response;
			}
		);

	}

	//保存 
	$scope.save=function(){
		var serviceObject;//服务层对象  				
		if($scope.entity.dcbFoodid!=null){//如果有ID
			if(document.getElementById("picName").value!=""){
				$scope.entity.dcbFoodpicture =document.getElementById("picName").value;
			}

			serviceObject=foodService.update( $scope.entity ); //修改  
		}else{

			$scope.entity.dcbFoodpicture = document.getElementById("picName").value;

			serviceObject=foodService.add( $scope.entity  );//增加


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
		foodService.dele( $scope.selectIds ).success(
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
		foodService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}
		);
		twocategoryService.findByRestaurantId().success(

			function(response){

				$scope.twoCategorylist = response;

			}
		)
	}


	$scope.findTwoList = function(){

		twocategoryService.findByRestaurantId().success(

			function(response){

				$scope.twoCategorylist = response;

			}
		)
	}

	$scope.jieshou = function () {
		alert(ceshi);

	}

	$scope.tiaozhuan = function() {
		alert("ceshi");
	}

});	
