package com.ht.test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world !!!");
//		ѭ�� for
		for (int i = 1; i <=100; ++i) {
			System.out.println(i+"for �Ҵ���");
		}
		System.out.println("���������");
		//ѭ�� while
		int a=10;
		while (a<=20) {
			System.out.println("a<20:����"+a);
			a++;
		}
		//ѭ�� do ... while
		int b=10;
		do {
			System.out.println("b<20:����"+b);
			b++;
		} while (b<20);
		// 1~100 ֮���ż���� 
		int c=1;
		StringBuffer num_oushu = new StringBuffer("");
		int sum_oushu=0;
		do {
			if(c%2==0) {
				System.out.println("ż��:" +c);
				num_oushu.append(c+",");
				sum_oushu+=c;
			}
			c++;
		}while(c<=100);
		System.out.println("����ż����"+num_oushu);
		System.out.println("����ż���ܺͣ�"+sum_oushu);
		
		//Ƕ��ѭ��
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j <60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					System.out.println(i+"��"+j+"��"+j2+"��");
					
				}
			}
		}
	}
}
