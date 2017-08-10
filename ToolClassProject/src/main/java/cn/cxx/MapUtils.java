package cn.cxx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapUtils {
	/**
	 * author:陈
	 * input:Map
	 * output:Map
	 * do:sort for Map's key
	 * */
	public static <E> Map<String,E> Sort(Map<String,E> map){
		List<Map.Entry<String,E>> list = new ArrayList<Map.Entry<String,E>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,E>>() {
            //升序排序
           
			public int compare(Entry<String, E> o1, Entry<String, E> o2) {
				// TODO Auto-generated method stub
				return (o1.getKey()).compareTo(o2.getKey());
			}

        });
		Map<String, E> reMap = new HashMap<String, E>();
		for (Entry<String, E> entry : list) {
			reMap.put(entry.getKey(), entry.getValue());
		}
		return reMap;
	}
}
