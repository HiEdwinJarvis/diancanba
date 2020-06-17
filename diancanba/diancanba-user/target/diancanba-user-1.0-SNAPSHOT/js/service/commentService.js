//服务层
app.service('commentService',function($http){

	//评论
	this.pinglun  = function(name,content){

		return $http.get('../comment/write.do?content='+content+'&name='+name);
	}

	//显示
	this.show = function(){
		return $http.get('../comment/show.do');
	}
});
