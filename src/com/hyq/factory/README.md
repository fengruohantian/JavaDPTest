#FactoryPatternTest

method-工厂方法模式通用

	定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
		
	工厂方法模式是一个经典的解耦框架。其优点具有良好的封装性，代码结构简单，并且方便扩展。
	
	通过继承Factory抽象工厂类可实现多个工厂类的场景。

simple-简单工厂模式（静态方法模式）
	
	该模式是工厂方法模式的简化版，去掉Factory抽象类直接将productFactory类中的方法createProduct前加static关键字
	
	虽然该方法不利于扩展，但是因为其简单，在很多场景下仍然是非常实用的。
	
extension-工厂方法模式扩展
	
	该方法用于缓存实体对象，使用完毕后不会进行释放，而是保留其初始状态。如JDBC连接数据库...
	
	该方法扩展方便，可适用如多数据源配置等减少生产和销毁带来的消耗。