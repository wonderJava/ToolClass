package cn.huchao.web;

import cn.huchao.util.PropertiesUtil;

/**
 * @author huchao
 *	@description
 *
 */
public class Base {
	public static void main(String[] args) {
		//System.out.println("nihao,shijie");
		//加载配置文件的实例
		String property2 = PropertiesUtil.getProperty("system_peizhi");
		System.out.println(property2);
		String property = PropertiesUtil.getProperty("sys_peizhi2");
		System.out.println(property);
	}
}
