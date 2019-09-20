package com.javatest.designpattern.singleton;

/**
 * 饿汉模式
 * @author Administrator
 *
 */

public class Singleton2 {
	//私有构造
	private Singleton2() {
		
	}
//	创建一个
	private static volatile Singleton2 instance = null;


	
	public static synchronized Singleton2 getInstance() {
		if(instance==null) {
			instance = new Singleton2();
		}
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(Singleton2.getInstance().toString());
		
	}
}
