package com.hyq.factory.extension;
/**
 * 该接口为产品父类，负责描述所有实例所共有的公共接口
 * @author Janus
 */
public abstract class Product {
	public abstract void appearance();	//产品外观
	public abstract void price();		//产品价格
	public abstract void sale();		//产品销售情况
}
