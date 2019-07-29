package com.ht.test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world !!!");
//		循环 for
		for (int i = 1; i <=100; ++i) {
			System.out.println(i+"for 我错了");
		}
		System.out.println("程序结束！");
		//循环 while
		int a=10;
		while (a<=20) {
			System.out.println("a<20:成立"+a);
			a++;
		}
		//循环 do ... while
		int b=10;
		do {
			System.out.println("b<20:成立"+b);
			b++;
		} while (b<20);
		// 1~100 之间的偶数； 
		int c=1;
		StringBuffer num_oushu = new StringBuffer("");
		int sum_oushu=0;
		do {
			if(c%2==0) {
				System.out.println("偶数:" +c);
				num_oushu.append(c+",");
				sum_oushu+=c;
			}
			c++;
		}while(c<=100);
		System.out.println("所有偶数："+num_oushu);
		System.out.println("所有偶数总和："+sum_oushu);
		
		//嵌套循环
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j <60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					System.out.println(i+"点"+j+"分"+j2+"秒");
					
				}
			}
		}
	}
}
