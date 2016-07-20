package com.hyq.factory.method;
/**
 * 具体工厂类实现
 * @author Janus
 */
public class productFactory extends Factory {
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product pro=null;
		try {
			pro = (Product) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) pro;
	}

}
