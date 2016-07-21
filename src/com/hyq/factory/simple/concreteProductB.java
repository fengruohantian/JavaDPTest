package com.hyq.factory.simple;
/**
 * 产品B
 * @author Janus
 */
public class concreteProductB extends Product {
	public concreteProductB(){
		System.out.println("我是产品B!");
	}
	/**
	 * 产品外观
	 */
	@Override
	public void appearance() {
		System.out.println("产品B的外观五角形！");
	}
	/**
	 * 产品价格
	 */
	@Override
	public void price() {
		System.out.println("产品B的价格200块！");
	}
	/**
	 * 产品销售情况
	 */
	@Override
	public void sale() {
		System.out.println("产品B的销售不好！");
	}

}
