package cn.huchao.web;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author huchao
 *	@2017年9月22日
 *	@description
 *	
 */
public class Pra5 {
	public static void main(String[] args) {
		/*String str1="{\"REQ_PARAM\":{\"BUSI_INFO\":{\"ACCESS_NUM\":\"13514740186\",\"OFFER_LIST\":[{\"OFFER_INFO\":{\"OFFER_LIST\":[{\"OFFER_INFO\":{\"CYCLE\":\"1\",\"OFFER_ID\":\"101040040172\",\"OFFER_TYPE\":\"12\",\"OPER_CODE\":\"1\"}}]}}],\"OPER_TYPE\":\"1\",\"SO_FEE_LIST\":[{\"SO_FEE_INFO\":{\"ACTUAL_FEE\":0,\"DEDUCT_FEE\":0,\"DEDUCT_MAX_FEE\":0,\"DEDUCT_MIN_FEE\":0,\"DEDUCT_PERMISSIONS\":false,\"DEDUCT_TYPE\":-1,\"FEE_ITEM_DESC\":\"\",\"FEE_ITEM_ID\":\"21000021\",\"FEE_ITEM_NAME\":\"上网预交费\",\"FEE_ITEM_TYPE\":\"1\",\"FEE_PLAN_ID\":\"501340040172\",\"INCLUDED_TAX\":\"\",\"IS_PRINT\":\"1\",\"OFFER_ID\":\"101040040172\",\"OFFER_NAME\":\"全区“和家庭”358爱家套餐-0元50M-包年不限时\",\"OPERATE_TYPE\":1,\"PAY_TYPE\":\"0\",\"POINT\":0,\"POINT_DENOMONATOR\":0,\"POINT_MUMERATOR\":0,\"SHOULD_FEE\":0,\"SOFEE_COUNT\":1,\"STATE\":\"0\",\"TAX_RATE\":\"\"}}]},\"PAGE_INFO\":{\"CURRENT_PAGE\":\"1\",\"PAGE_SIZE\":\"20\"},\"PUB_INFO\":{\"CHANNEL_ID\":\"4001\",\"OP_CODE\":\"SYS74010187\",\"OP_ORG_ID\":\"74010051\",\"REQ_SERIAL_NO\":\"3735017612\"}}}\"";
		String str2="{\"REQ_PARAM\":{\"PAGE_INFO\":{\"PAGE_SIZE\":\"20\",\"CURRENT_PAGE\":\"1\"},\"BUSI_INFO\":{\"SO_FEE_LIST\":[{\"SO_FEE_INFO\":{\"SHOULD_FEE\":\"0\",\"DEDUCT_FEE\":\"0\",\"OFFER_NAME\":\"全区“和家庭”358爱家套餐-0元50M-包年不限时\",\"FEE_ITEM_ID\":\"21000021\",\"POINT_MUMERATOR\":\"0\",\"ACTUAL_FEE\":\"0\",\"SOFEE_COUNT\":\"1\",\"POINT\":\"0\",\"INCLUDED_TAX\":\"\",\"DEDUCT_MAX_FEE\":\"0\",\"FEE_ITEM_NAME\":\"上网预交费\",\"POINT_DENOMONATOR\":\"0\",\"PAY_TYPE\":\"0\",\"FEE_ITEM_TYPE\":\"1\",\"AGENT_ACCESS_NUM\":\"\",\"OFFER_ID\":\"101040040172\",\"FEE_ITEM_DESC\":\"\",\"TAX_RATE\":\"\",\"DEDUCT_MIN_FEE\":\"0\",\"DEDUCT_TYPE\":\"-1\"}}],\"ACCESS_NUM\":\"13514740186\",\"OFFER_LIST\":[{\"OFFER_INFO\":{\"OFFER_LIST\":[{\"OFFER_INFO\":{\"OPER_CODE\":\"1\",\"OFFER_ID\":\"101040040172\",\"OFFER_TYPE\":\"12\",\"CLCLE\":\"1\"}}]}}],\"OPER_TYPE\":\"1\"},\"PUB_INFO\":{\"OP_CODE\":\"SYS74010187\",\"REQ_SERIAL_NO\":\"3735017612\",\"CHANNEL_ID\":\"4001\",\"OP_ORG_ID\":\"74010051\"}}}";
		boolean b = jsonEquals(str1, str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(b);*/
		List<String> list1 =new ArrayList<>();
		List<String> list3 =new ArrayList<>();
		List<Object> list2 =new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list3.add("3");
		list3.add("4");
		System.out.println("list1 is :"+list1);
		list2.add(list1);
		list2.add(list3);
		System.out.println("list2 is :"+list2);
		list1.clear();
		System.out.println("clear list1");
		System.out.println("list1 is :"+list1);
		System.out.println("list2 is :"+list2);
		List<Object> list4=(List<Object>) list2.get(0);
		list4.add("55");
		System.out.println("after clear ,get list2  add is:"+list4);
	}
	
	   
	   /**
	    * 比较两个json串是否相同
	    * @param j1  第一个json串(json串中不能有换行)
	    * @param j2 第二个json串(json串中不能有换行)
	    * @return 布尔型比较结果
	    */
	 public static boolean jsonEquals(String j1,String j2){
	   
	   //将json中表示list的[]替换成{}。思想：只保留层次结构，不区分类型
	   //这样直接替换，可能会导致某些value中的符号也被替换，但是不影响结果，因为j1、j2的变化是相对的
	   j1 = j1.replaceAll("\\[", "{");
	   j1 = j1.replaceAll("]", "}");
	   j2 = j2.replaceAll("\\[", "{");
	   j2 = j2.replaceAll("]", "}");
	   //将json中，字符串型的value中的{},字符替换掉，防止干扰(并没有去除key中的，因为不可能存在那样的变量名)
	       //未转义regex：(?<=:")(([^"]*\{[^"]*)|([^"]*\}[^"]*)|([^"]*,[^"]*))(?=")
	   Pattern pattern = Pattern.compile("(?<=:\")(([^\"]*\\{[^\"]*)|([^\"]*\\}[^\"]*)|([^\"]*,[^\"]*))(?=\")");
	       j1 = cleanStr4Special(j1, pattern.matcher(j1));
	       j2 = cleanStr4Special(j2, pattern.matcher(j2));
	   //转义字符串value中的空格
	   //未转义regex:"[^",]*?\s+?[^",]*?"
	   pattern = Pattern.compile("\"[^\",]*?\\s+?[^\",]*?\"");
	       j1 = cleanStr4Space(j1, pattern.matcher(j1));
	       j2 = cleanStr4Space(j2, pattern.matcher(j2));
	       //现在可以安全的全局性去掉空格
	       j1 = j1.replaceAll(" ", "");
	       j2 = j2.replaceAll(" ", "");
	   //调用递归方法
	   return compareAtom(j1,j2);
	  }
	  
	  /**
	   * 比较字符串核心递归方法
	   * @param j1
	   * @param j2
	   * @return
	   */
	  private static boolean compareAtom(String j1,String j2){
	    
	    if(!j1.equals("?:\"?\"")){
	      //取出最深层原子
	      String a1 = j1.split("\\{",-1)[j1.split("\\{",-1).length-1].split("}",-1)[0];
	      String a2 = j2.split("\\{",-1)[j2.split("\\{",-1).length-1].split("}",-1)[0];
	      String j2_ = j2;
	      String a2_ = a2;
	      //转换成原子项
	      String i1[] = a1.split(",");
	      //在同级原子中寻找相同的原子
	      while(!a2.startsWith(",") &&
	          !a2.endsWith(",") &&
	          a2.indexOf(":,")<0 &&
	          a2.indexOf(",,")<0
	         ){
	        //遍历消除
	        for(String s : i1){
	          a2_ = a2_.replace(s,"");
	        }
	        //此时a2_剩下的全是逗号，如果长度正好等于i1的长度-1，说明相等
	        if(a2_.length() == i1.length-1){
	          //相等则从j1、j2中消除，消除不能简单的替换，因为其他位置可能有相同的结构，必须从当前位置上消除
	          int index = 0;
	          index = j1.lastIndexOf("{" + a1 + "}");
	          j1 = j1.substring(0, index)+j1.substring(index).replace("{" + a1 + "}", "?:\"?\"");
	          index = j2.lastIndexOf("{" + a2 + "}");
	          j2 = j2.substring(0, index)+j2.substring(index).replace("{" + a2 + "}", "?:\"?\"");
	          //递归
	          return compareAtom(j1, j2);
	        }else{
	          //寻找下一个同级原子
	          j2_ = j2_.replace("{" + a2 + "}", "");
	          a2 = j2_.split("\\{",-1)[j2_.split("\\{",-1).length-1].split("}",-1)[0];
	          a2_ = a2;
	        }
	      }
	      return false;
	    }else{
	      //比较是否相同
	      return j1.equals(j2);
	    }
	  }
	  
	  /**
	   * json字符串特殊字符清理辅助方法
	   * @param j 需要清理的json字符串
	   * @param matcher 正则表达式匹配对象
	   * @return 净化的json串
	   */
	  private static String cleanStr4Special(String j,Matcher matcher){
	    String group = "";
	    String groupNew = "";
	    while(matcher.find()){
	      group = matcher.group();
	      groupNew = group.replaceAll("\\{", "A");
	      groupNew = groupNew.replaceAll("}", "B");
	      groupNew = groupNew.replaceAll(",", "C");
	      j = j.replace(group, groupNew);
	   }
	   return j;
	 }
	 
	 /**
	  * json串字符串类型的value中的空格清理辅助方法
	  * @param j 需要清理的json字符串
	  * @param matcher 正则表达式匹配对象
	  * @return 净化的json串
	  */
	 private static String cleanStr4Space(String j,Matcher matcher){
	     String group = "";
	       String groupNew = "";
	       while(matcher.find()){
	           group = matcher.group();
	           groupNew = group.replaceAll(" ", "S");
	           j = j.replace(group, groupNew);
	       }
	       return j;
	 }
}

