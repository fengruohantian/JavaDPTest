package com.hyq.singleton.lazy;
/**
 * 懒汉式单例 
 * @author Janus
 */
public class Singleton {
	
	private static Singleton singleton=null;
	
	private  Singleton(){
		
	}
	//对外提供唯一创建方法
	public static Singleton getInstance(){
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
