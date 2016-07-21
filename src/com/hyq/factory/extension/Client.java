package com.hyq.factory.extension;

import java.security.AlgorithmConstraints;

/**
 * 客户端
 * @author Janus
 */
public class Client {

	public static void main(String[] args) throws Exception {
		Product a = productFactory.createProduct("A");
		a.appearance();
		Product a1 = productFactory.createProduct("A");
		a1.price();
	}
}
