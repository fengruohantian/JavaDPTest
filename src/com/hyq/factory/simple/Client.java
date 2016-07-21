package com.hyq.factory.simple;
/**
 * 客户端
 * @author Janus
 */
public class Client {

	public static void main(String[] args) {
		//创建简单工厂
		Product a = productFactory.createProduct(concreteProductA.class);
		a.appearance();
		a.price();
		a.sale();
		Product b = productFactory.createProduct(concreteProductB.class);
		b.appearance();
		b.price();
		b.sale();
	}
}
