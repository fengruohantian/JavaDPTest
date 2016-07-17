package com.hyq.factory.simple;
/**
 * 客户端
 * @author Janus
 */
public class Client {

	public static void main(String[] args) {
		//创建工厂
		Factory f=new Factory();
		f.createProduct("");
		f.show();
	}

}
