package com.javatest.designpattern.singleton;

/**
 * 饱汉
 * @author Administrator
 *
 */

public class Singleton1 {
	//私有构造
	private Singleton1() {
		
	}
//	创建一个
	private static volatile Singleton1 instance = new Singleton1();


	
	public static  Singleton1 getInstance() {
		return instance;
	}
	public static void main(String[] args) {
		Singleton1.getInstance().toString();
	}
}
