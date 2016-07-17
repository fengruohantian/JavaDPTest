#SingletonPatternTest
单例模式
	确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
饿汉式单例(通用)-->currency-Singleton.java
	在类创建的同时创建实例，以后也不会改变，不用考虑线程的问题。
懒汉式单例-->lazy-Singleton.java
	外部程序无法进行初始化，只有在调用getInstance()创建实例。
	该单例实现方式没有考虑线程问题。
	需要对getInstance()方法进行改造，最简单的方式之一为对此方法添加synchronized保证线程同步。
	此方法没有考虑线程安全问题，若第一个线程执行创建对象但是还没有获取到对象，第二个线程也要获取对象此时判断为null校验就会通过
	继续执行下去第一个、第二个线程都会获得对象，那么内存中就会出现两个对象；
单例模式扩展-->extend package
	
