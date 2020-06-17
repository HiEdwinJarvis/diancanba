//控制层
app.controller('productController' ,function($scope,$controller,$location   ,onecategoryService,twocategoryService,foodService) {

    $controller('baseController', {$scope: $scope});//继承
    $scope.onecategory = $location.search()['onecategory'];

    $scope.twocategory=-1;

    $scope.search=function(page,rows){


        //菜单列表
        foodService.findByRestaurantId(page,rows,$scope.twocategory).success(

            function(response){
                $scope.foodList = response.rows;

                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        )
        //二级分类
        twocategoryService.findByRestaurantId().success(

            function(response){

                $scope.twocategoryList = response;

            }
        )
        //热门菜
        foodService.findByIsHot("").success(
            function(response){

                $scope.HotFoodList = response;
            }
        )

    }

/*    $scope.search=function(page,rows){
        $scope.searchEntity.dcbTwocategoryid = -1;

        //菜单列表
        foodService.search(page,rows,$scope.searchEntity).success(

            function(response){
                $scope.foodList = response.rows;

                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        )
        //二级分类
        twocategoryService.findByRestaurantId().success(

            function(response){

                $scope.twocategoryList = response;

            }
        )
        //热门菜
        foodService.findByIsHot("").success(

            function(response){

                $scope.HotFoodList = response;
            }
        )

    }*/

    /**
     * 分类查找
     * 安卓二级分类查找下面的菜品
     *
     */
   /* $scope.searchEntity={};//定义搜索对象
    $scope.panduan = 0;
    $scope.findBytwoCategory = function(twoCategoryId){

        if(twoCategoryId == ''){
            twoCategoryId = -1;
        }
       /!* foodService.search(1,100,$scope.searchEntity).success(
            function(response){
                $scope.foodList = response.rows;
                $scope.paginationConf.currentPage = 1;
                //$scope.paginationConf.itemsPerPage = response.total;
               // $scope.currentPage = 1;
               // $scope.itemsPerPage = 1;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        )*!/
        $scope.searchEntity.dcbTwocategoryid = twoCategoryId;
        foodService.search(1,1,$scope.searchEntity).success(

            function(response){
                $scope.foodList = response.rows;

                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        )


    }*/
    /**
     * 分类查找
     * 安卓二级分类查找下面的菜品
     *
     */
    $scope.k = true;
    $scope.findBytwoCategory = function(twoCategoryId){

        if(twoCategoryId == ''){
            twoCategoryId = -1;
        }

        foodService.findByRestaurantId(1,100,twoCategoryId).success(

            function(response){
                $scope.foodList = response.rows;
$scope.k = false;
                //$scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        )


    }

    $scope.andList = function(foodId){
        foodService.andList(foodId,1).success(
            function(response){
                alert(response.message);
            }
        )
    }
});