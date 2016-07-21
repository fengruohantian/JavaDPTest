package com.hyq.factory.method;
/**
 * 创建抽象工厂
 * PS:通过继承该类可创建多个工厂
 * @author Janus
 */
public abstract class Factory {
	//创建一个产品对象
	public abstract <T extends Product> T createProduct(Class<T> c);
}
