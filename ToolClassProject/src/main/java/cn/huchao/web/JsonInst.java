package cn.huchao.web;

import java.util.Map;

import cn.huchao.util.JsonUtil;

/**
 * @author huchao
 *	@2017年7月3日
 *	@description
 *	Json 转换的实例
 */
public class JsonInst {
	public static void main(String[] args) {
		String resp = "{\"rtnCode\":\"0\",\"rtnMsg\":\"成功!\",\"bean\":{},\"beans\":[],\"object\":{\"result\":{\"cmdName\":\"电子渠道充值状态查询接口\",\"crset\":{\"row\":{\"col_1\":0,\"col_0\":0}}},\"retCode\":\"100\",\"retMsg\":\"succeeded!\"}}";
		System.out.println(resp);
		JsonUtil.convertJson2Object(resp, Map.class);
	}
}

