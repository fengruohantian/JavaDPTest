package com.hyq.factory.simple;

public class Factory {
	Product pro=null;
	public void createProduct(String type){
		switch(type){
			case "A":
				this.pro=new concreteProductA();
				break;
			case "B":
				this.pro = new concreteProductB();
				break;
			default:
				System.out.println("没有生产该类型的磨具！");
		}
	}
	public void show(){
		if(pro!=null){
			pro.appearance();
			pro.price();
			pro.sale();
		}else{
			System.out.println("没有产品详情哦！");
		}
	}
}
