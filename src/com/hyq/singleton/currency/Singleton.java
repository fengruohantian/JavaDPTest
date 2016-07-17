package com.hyq.singleton.currency;
/**
 * 单例模式-通用（饿汉式单例）
 * @author Janus
 */
public class Singleton {

	private static final Singleton singleton=new Singleton();
	//限制产生多个实例
	private Singleton(){
		
	}
	//通过该方法获得实例
	public static Singleton getSingleton(){
		return singleton;
	}
	//执行方法...
	public static void doSomething(){
		System.out.println("单例模式");
	}
}
