package com.hyq.factory.extension;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载工厂类
 * @author Janus
 */
public class productFactory {
	//定义缓存池，若存在则直接使用，否则添加到缓存池中
	private static final Map<String,Product> map = new HashMap<String,Product>();
	//线程同步避免内存中产生错误数据
	public static synchronized Product createProduct(String type) throws Exception{
		Product pro = null;
		if(map.containsKey(type)){
			 pro = map.get(type);
			 System.out.println("产品"+type+"对象已从缓存中获取！------------------");
		}else{
			pro=setCacheMap(type);
			map.put(type,pro);
			System.out.println("产品"+type+"存入缓存中！------------------");
		}
		return pro;
	}
	private static Product setCacheMap(String type) throws Exception {
		Product pro=null;
		switch(type){
			case "A":
				pro = new concreteProductA();
				break;
			case "B":
				pro = new concreteProductB();
				break;
			default :
				throw new Exception("数据出错");
		}
		return pro;
	}
}
