package cn.huchao.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huchao
 *	@2017年7月12日
 *	@description
 *	
 */
public class Pra2 {
	/**
	 * @description
	 *	获取两个List的不同元素 
	 * @param list1
	 * @param list2
	 * @return
	 *@2017年7月12日
	 *@author huchao
	 */
    private static List<String> getDiffList(List<String> list1, List<String> list2) {  
        long st = System.nanoTime();  
        Map<String, Integer> map = new HashMap<String, Integer>(list1.size() + list2.size());  
        List<String> diff = new ArrayList<String>();  
        for (String string : list1) {  
            map.put(string, 1);  
        }  
        for (String string : list2) {  
            Integer cc = map.get(string);  
            if (cc != null) {  
                map.put(string, ++cc);  
                continue;  
            }  
            map.put(string, 1);  
        }  
        for (Map.Entry<String, Integer> entry : map.entrySet()) {  
            if (entry.getValue() == 1) {  
                diff.add(entry.getKey());  
            }  
        }  
        System.out.println("getDiffrent3 total times " + (System.nanoTime() - st));  
        return diff;  
    }  
    public static void main(String[] args) {
		/*List<String> list1 =new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		List<String> list2 =new ArrayList<>();
		list2.add("3");
		list2.add("4");
		list2.add("5");
		list2.add("6");
		list2.add("7");
		List<String> diffrent3 = getDiffList(list1, list2);
		System.out.println(diffrent3);*/
    	/*String fileName="XZ_" + "20170710" + "_01.txt";
    	String str = fileName.substring(0, fileName.length()-4);
    	System.out.println(str);*/
    	String requestBody = "transdata=%7B%22succdata%22%3A%2220170724113234700163910%5E0.02%22%2C%22faildata%22%3A%22%22%2C%22appid%22%3A%225000001452%22%2C%22notifytime%22%3A%222017-07-24+14%3A16%3A00%22%2C%22refundno%22%3A%2220170724113404542725%22%7D&sign=jKlJES80gMdKXQEQeoyb%2FzyDj6IGECDrmtvlenbFAbRMRHJgqZkPIWmgrp26Ie5ErDy5rW8QAqmIYqd6EGSAOf1Sgb3pZxw7gYdWEuyahrFk2vEHIH86h0SY0LmWLAP3hXCCmssbfWG13%2BjRBNZZWfvJwkh%2Fa3x8UTPubH%2BYPbk%3D&signtype=RSA";
    	System.out.println(requestBody.length());
	}
}

