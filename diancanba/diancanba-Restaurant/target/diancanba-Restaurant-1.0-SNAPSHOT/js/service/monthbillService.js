//服务层
app.service('monthbillService',function($http){
	    	

	this.findMonthbill = function(year){
		return $http.get('../monthbill/findMonthbill.do?year='+year);
	}
});
