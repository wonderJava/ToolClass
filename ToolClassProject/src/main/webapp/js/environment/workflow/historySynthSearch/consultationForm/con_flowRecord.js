define([ 'Util', 'process', 'indexLoad', 'hdb' ,'text!module/workflow/oneservicecomplain/one_flowRecord.html','style!css/workflow/oneservicecompain/one_flowRecord.css'], function(Util, Process, IndexLoad, Hdb,Html_flowRecord) {
	var list;
	var $el;
	var _index;
	var _options;
	var initialize = function(index, options){
		$el = $(Html_flowRecord);
		_index = index;
		_options=options;
		flowRList.call(this,$el);
		this.content = $el;
	};

	var flowRList = function() {
		var params = {
			serialno : '20170308192052401627'
		};
		//  
		Util.ajax.postJson(
				'/ngwf_he/front/sh/workflow!execute?uid=queryFlowRecord', params,
				function(result) {
					if(result.beans.length==0){
						var noContent='<img src="data:image/png;base64,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" alt="暂无信息"><p>暂无信息</p>';
						$('#flr_container',$el).html(noContent);
					}else{
						$.each(result.beans, function(index, bean) {
							console.log(result.beans.length);
							var len=result.beans.length;
							var movecreate='<li>'+
							'<span >处理记录'+(index+1)+'</span>'+
							'<div class="flow-right">'+
								'<div class="circle"></div>'+
								'<div class="flowRline"></div>'+
							'</div>'+
							'</li>'
							$('.aaaa',$el).append(movecreate);
						});
						// 注册一个Handlebars模版，通过id找到某一个模版，获取模版的html框架
						var myTemplate = Hdb.compile($("#table-template",$el).html());
						// 将json对象用刚刚注册的Handlebars模版封装，得到最终的html，插入到基础table中。
						$('#tableList',$el).html(myTemplate(result));
					}
					
				}, true);
	};
	return initialize;
});