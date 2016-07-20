package com.hyq.factory.method;
/**
 * 客户端
 * @author Janus
 */
public class Client {

	public static void main(String[] args) {
		//创建工厂
		Factory f=new productFactory();
		Product a = f.createProduct(concreteProductA.class);
		a.appearance();
		a.price();
		a.sale();
		Product b = f.createProduct(concreteProductB.class);
		b.appearance();
		b.price();
		b.sale();
	}
}
