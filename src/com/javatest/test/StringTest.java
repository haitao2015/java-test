package com.javatest.test;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "aaa";
		System.out.println(str1 == str2);//返回TRUE
		String str3 = new String("aaa");
		System.out.println(str1 == str3);//返回FALSE   地址不一样
		String interns = str3.intern();
		System.out.println(interns == str1);//返回TRUE
//		String str3="";
//		String str4="";
//		String str5="";
		int  a=2 << 3;//左移3
		int b= 16>> 2;//右移2
		System.out.println(a);
		System.out.println(b);
		int key=2;
		switch (key) {
		case 1:
			System.out.println("switch:"+1);
//			break;
		case 2:
			System.out.println("switch:"+2);

//			break;
		case 3:
			System.out.println("switch:"+3);

//		break;
	
			default:
				System.out.println("switch:"+0);
				break;
			}
		}
}
