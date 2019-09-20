package com.javatest.test;

public class MyThread extends Thread{
	@Override
	public void run() {
		
		System.out.println("启动:"+this.currentThread().getName());
	}

}
