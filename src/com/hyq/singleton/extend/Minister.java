package com.hyq.singleton.extend;
/**
 * 单例模式-实例
 * 皇帝-臣子-->臣子
 * 实例来源：设计模式之禅
 * @author Janus
 */
public class Minister {
	public static void main(String[] args) {
		//定义进贡的臣子数量
		int numMinster=5;
		for (int i = 0; i < numMinster; i++) {
			//各臣子开始觐见皇帝
			Emperor e= Emperor.getInstance();
			System.out.print("第"+i+"个大臣觐见，参拜的皇帝是：");
			//皇帝进行安抚
			e.say();
		}
	}
}
