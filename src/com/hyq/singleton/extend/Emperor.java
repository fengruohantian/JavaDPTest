package com.hyq.singleton.extend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 单例模式-实例
 * 皇帝-臣子-->皇帝
 * 实例来源：设计模式之禅
 * @author Janus
 */
public class Emperor {
	//定义最多能产生的数量
	private static int maxNumOfEmperor=2;
	//定义每个皇帝的名字用一个私有属性的ArrayList来
	private static List<String> nameList=new ArrayList<String>();
	//定义列表用来容纳所有皇帝实例
	private static List<Emperor> emperorList=new ArrayList<Emperor>();
	//定义当前皇帝的序号
	private static int countNumOfEmperor=0;
	//定义初始化方法，该方法在类创建时自动执行
	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("皇帝"+i));
		}
	}
	//限制产生皇帝的数量
	private Emperor(){
		
	}
	//传入皇帝的名称
	private Emperor(String name){
		this.nameList.add(name);
	}
	//随机获取一个皇帝
	public static Emperor getInstance(){
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	//皇帝开始说话
	public static void say(){
		System.out.println(nameList.get(countNumOfEmperor));
	}
}
