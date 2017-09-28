package cn.huchao.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

/**
 * @author huchao
 * @2017年9月22日
 * @description
 * 
 */
public class CompareJson {
	public static void main(String[] args) {
		String str1="{\"REQ_PARAM\":{\"BUSI_INFO\":{\"ACCESS_NUM\":\"13514740186\",\"OFFER_LIST\":[{\"OFFER_INFO\":{\"OFFER_LIST\":[{\"OFFER_INFO\":{\"CYCLE\":\"1\",\"OFFER_ID\":\"101040040172\",\"OFFER_TYPE\":\"12\",\"OPER_CODE\":\"1\"}}]}}],\"OPER_TYPE\":\"1\",\"SO_FEE_LIST\":[{\"SO_FEE_INFO\":{\"ACTUAL_FEE\":0,\"DEDUCT_FEE\":0,\"DEDUCT_MAX_FEE\":0,\"DEDUCT_MIN_FEE\":0,\"DEDUCT_PERMISSIONS\":false,\"DEDUCT_TYPE\":-1,\"FEE_ITEM_DESC\":\"\",\"FEE_ITEM_ID\":\"21000021\",\"FEE_ITEM_NAME\":\"上网预交费\",\"FEE_ITEM_TYPE\":\"1\",\"FEE_PLAN_ID\":\"501340040172\",\"INCLUDED_TAX\":\"\",\"IS_PRINT\":\"1\",\"OFFER_ID\":\"101040040172\",\"OFFER_NAME\":\"全区“和家庭”358爱家套餐-0元50M-包年不限时\",\"OPERATE_TYPE\":1,\"PAY_TYPE\":\"0\",\"POINT\":0,\"POINT_DENOMONATOR\":0,\"POINT_MUMERATOR\":0,\"SHOULD_FEE\":0,\"SOFEE_COUNT\":1,\"STATE\":\"0\",\"TAX_RATE\":\"\"}}]},\"PAGE_INFO\":{\"CURRENT_PAGE\":\"1\",\"PAGE_SIZE\":\"20\"},\"PUB_INFO\":{\"CHANNEL_ID\":\"4001\",\"OP_CODE\":\"SYS74010187\",\"OP_ORG_ID\":\"74010051\",\"REQ_SERIAL_NO\":\"3735017612\"}}}\"";
		String str2="{\"REQ_PARAM\":{\"PAGE_INFO\":{\"PAGE_SIZE\":\"20\",\"CURRENT_PAGE\":\"1\"},\"BUSI_INFO\":{\"SO_FEE_LIST\":[{\"SO_FEE_INFO\":{\"SHOULD_FEE\":\"0\",\"DEDUCT_FEE\":\"0\",\"OFFER_NAME\":\"全区“和家庭”358爱家套餐-0元50M-包年不限时\",\"FEE_ITEM_ID\":\"21000021\",\"POINT_MUMERATOR\":\"0\",\"ACTUAL_FEE\":\"0\",\"SOFEE_COUNT\":\"1\",\"POINT\":\"0\",\"INCLUDED_TAX\":\"\",\"DEDUCT_MAX_FEE\":\"0\",\"FEE_ITEM_NAME\":\"上网预交费\",\"POINT_DENOMONATOR\":\"0\",\"PAY_TYPE\":\"0\",\"FEE_ITEM_TYPE\":\"1\",\"AGENT_ACCESS_NUM\":\"\",\"OFFER_ID\":\"101040040172\",\"FEE_ITEM_DESC\":\"\",\"TAX_RATE\":\"\",\"DEDUCT_MIN_FEE\":\"0\",\"DEDUCT_TYPE\":\"-1\"}}],\"ACCESS_NUM\":\"13514740186\",\"OFFER_LIST\":[{\"OFFER_INFO\":{\"OFFER_LIST\":[{\"OFFER_INFO\":{\"OPER_CODE\":\"1\",\"OFFER_ID\":\"101040040172\",\"OFFER_TYPE\":\"12\",\"CLCLE\":\"1\"}}]}}],\"OPER_TYPE\":\"1\"},\"PUB_INFO\":{\"OP_CODE\":\"SYS74010187\",\"REQ_SERIAL_NO\":\"3735017612\",\"CHANNEL_ID\":\"4001\",\"OP_ORG_ID\":\"74010051\"}}}";
		Gson gson1 = new GsonBuilder().create();// or new Gson()
		JsonElement e1 = gson1.toJsonTree(str1);// or new Gson()

		Gson gson2 = new GsonBuilder().create();
		JsonElement e2 = gson2.toJsonTree(str2);
		System.out.println(e1.equals(e2));
	}
}
