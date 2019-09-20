package com.javatest.test;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int a1 = 1000;
		int b1 = 1000;
		Integer a2 = 10;
		Integer a3 = 10;
		System.out.println(a1 == b1);
		System.out.println(a2.equals(a1));

		// -128~ 127 不创建新对象 缓存值 Short Integer Long
		// Integer a2=10;
		// Integer a3=10;
		// System.out.println(a2==a3);
		// Short
		Short s = 12;
		Short s1 = 12;
		// System.out.println(s==s1);//true;不创建新对象 缓存值
		Short s2 = 129;
		Short s3 = 129;
		// System.out.println(s2==s3);//false创建新对象 比较地址
		Long l = 12L;
		Long l1 = 12L;
		System.out.println(l == l1);// true;不创建新对象 缓存值
		Long l2 = 129L;
		Long l3 = 129L;
		System.out.println(l2 == l3);// false创建新对象 比较地址

//		Float f=12f;
//		Float f1=12f;
//		System.out.println(f==f1);//false;
//		Float f2=1200f;
//		Float f3=1200f;
//		System.out.println(f2==f3);//false;
//		
		Double f = 12.0;
		Double f1 = 12.0;
		System.out.println(f == f1);// false;
		Double f2 = (double) 1200;
		Double f3 = (double) 1200;
		System.out.println(f2 == f3);// false;

		String str1 = new String("ABC");
		StringBuffer str12 = new StringBuffer("aaa");
		StringBuilder str13 = new StringBuilder("aaa");
		List llist = new LinkedList<>();
		llist.add("AAA");
		llist.add("BBB");
		llist.add("CCC");
		llist.add("DDD");
		llist.add("AAA");
		llist.remove(4);
		for (Object object : llist) {
			System.out.println(object.toString());

		}
		Set st = new TreeSet<>();
		st.add("ABC");
		st.add("ABCd");
		for (Iterator iterator = st.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println("aaaaaaaaaaaaaaa===" + object.toString());
		}

		Map hstb = new Hashtable();
		// 新建-就绪-运行-停止-阻塞

		/*
		 * SpringMVC
		 * 
		 * 请求捕获 查找Handler 执行handler 渲染viewResolver 通过viewResolver返回客户端
		 * 用户发送请求到前端控制器dispatcherServlet捕获请求URL ，
		 * 得到URI，通过调用HandlerMapping，得到Hanler配置相关的对像（Handler以及对应的Hangdler拦截器）
		 * 并HandlerExcuationChain返回 ；
		 * dispacherServlet选择一个适合的HandlerAdapter(处理器适配器),提取Request中的模型数据,填充Handler入参,并执行
		 * 。执行完毕向dispatcherServlet返回一个ModelAndView对象； DispatcherServlet
		 * 根据返回的ModleAndView，选择一个适合的ViewResolver， 通过ViewResoler结合Modle 和view
		 * ，来渲染视图，Dispatchservlet将渲染结果返回给客户端 （渲染返回）。
		 * 
		 * 核心点： 核心控制捕获请求、查找Handler、执行Handler、选择ViewResolver，通过ViewResolver渲染视图并返回
		 */
		/*
		 * MyThread t=new MyThread(); t.start(); Thread t1=new Thread(new Runnable() {
		 * 
		 * @Override public void run() {
		 * 
		 * // TODO Auto-generated method stub System.out.println(); } });
		 * t1.setName("thread-02"); t1.start();
		 * 
		 * Executors.newSingleThreadExecutor();
		 */
		System.out.println("#####################################WS");
		int[] aa = { 2, 3, 1, 5, 7, 9 };
		bubbleSort(aa);
		System.out.println("#####################################select####");
		int[] bb = { 2, 3, 1, 5, 7, 9 };
		selectSort(bb);
		System.out.println("##################################### InSERT####");
		
	}

	/**
	 * 冒泡排序
	 * 
	 * @param arry
	 */
	private static void bubbleSort(int[] arry) {
		int temp;
		int flag;
		// 当前与后一个比较
		for (int i = 0; i < arry.length - 1; i++) {// 外层循环，它决定一共走几趟
			flag = 0;
			for (int k = 0; k < arry.length - 1 - i; k++) {// 内层循环，它决定每趟走几次
				if (arry[k] < arry[k + 1]) {
					temp = arry[k];
					arry[k] = arry[k + 1];
					arry[k + 1] = temp;
					flag++;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		System.out.println(Arrays.toString(arry));
	}

	/***
	 * 选择排序
	 * 简单选择排序  代码
	 *对于给定的一组记录，经过第一轮比较后得到最小的记录，然后将该记录的位置与第一个记录的位置交换；接着对不包括第一个记录
	 * 以外的其他记录进行第二次比较，得到最小记录并与第二个位置记录交换；重复该过程，知道进行比较的记录只剩下一个为止。
	 * @param arry
	 */
	private static void selectSort(int[] arry) {
		int temp=0;
		for(int i=0;i<arry.length-1;i++) {
			int minindex=i;//
			for(int k=i+1;k<arry.length;k++) {
				if(arry[minindex]>arry[k]) {
					minindex=k;
				} 
			}
			if(minindex!=i) { //交换
				temp=arry[i];
				arry[i]=arry[minindex];
				arry[minindex]=temp;
			}
		}
		System.out.println(Arrays.toString(arry));
	}
	/***
	 * 插入排序
	 * @param arry
	 */
	private static void insertSort(int[] arry) {
		System.out.println(Arrays.toString(arry));
	}
}
