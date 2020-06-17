 //控制层 
app.controller('daybillController' ,function($scope,$controller   ,daybillService,monthbillService){
	
	$controller('baseController',{$scope:$scope});//继承

	var cc =[];
	$scope.year=2020;
    //查询本月每天所有的营业额
	$scope.findBill = function(){
		daybillService.findBill().success(

			function(response){
				var chart = Highcharts.chart('container', {
					chart: {
						type: 'line'
					},
					title: {
						text: '这个月每天的营业额'
					},
					subtitle: {
						text: '每日0点数据自动汇总'
					},
					xAxis: {
						categories: ['','一号', '二号', '三号', '四号', '五号', '六号', '七号','八号', '九号', '十号', '十一号', '十二号', '十三号', '十四号','十五号', '十六号', '十七号', '十八号', '十九号', '二十号', '二十一号','二十二号', '二十三号', '二十四号', '二十五号', '二十六号', '二十七号', '二十八号','二十九号','三十号','三十一号']
					},
					yAxis: {
						title: {
							text: '人民币（元）'
						}
					},
					plotOptions: {
						line: {
							dataLabels: {
								// 开启数据标签
								enabled: true
							},
							// 关闭鼠标跟踪，对应的提示框、点击事件会失效
							enableMouseTracking: false
						}
					},
					series: [{
						name: '走势变化',
						data: response//[1000, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6,7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
					}]
				});




			}
		)
	}



	$scope.findMonthbill = function(){
		monthbillService.findMonthbill($scope.year).success(
			function(response){
				/*
	* 柱状图
	* */
				var chart = Highcharts.chart('container2',{
					chart: {
						type: 'column'
					},
					title: {
						text: '月营业额'
					},
					subtitle: {
						text: '数据来源: 汇总'
					},
					xAxis: {
						categories: [
							'','一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'
						],
						crosshair: true
					},
					yAxis: {
						min: 0,
						title: {
							text: '月营业额 (元)'
						}
					},
					tooltip: {
						// head + 每个 point + footer 拼接成完整的 table
						headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
						pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
							'<td style="padding:0"><b>{point.y:.1f} </b></td></tr>',
						footerFormat: '</table>',
						shared: true,
						useHTML: true
					},
					plotOptions: {
						column: {
							borderWidth: 0
						}
					},
					series: [{
						name: '',
						data: response
					}]
				});


			}
		)
	}





});	
