package com.hyq.factory.simple;
/**
 * 该接口为产品父类，负责描述所有实例所共有的公共接口
 * @author Janus
 */
public interface Product {
	void appearance();	//产品外观
	void price();		//产品价格
	void sale();		//产品销售情况
}
