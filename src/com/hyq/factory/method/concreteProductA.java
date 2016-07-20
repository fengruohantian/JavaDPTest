package com.hyq.factory.method;
/**
 * 产品A
 * @author Janus
 */
public class concreteProductA extends Product {
	public concreteProductA(){
		System.out.println("我是产品A!");
	}
	/**
	 * 产品外观
	 */
	@Override
	public void appearance() {
		System.out.println("产品A的外观正方形！");

	}
	/**
	 * 产品价格
	 */
	@Override
	public void price() {
		System.out.println("产品A的价格100块！");
	}
	/**
	 * 产品销售情况
	 */
	@Override
	public void sale() {
		System.out.println("产品A的销售良好！");
	}

}
