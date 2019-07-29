package com.ht.test;



public class Test {
	/**
     * 冒泡排序
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。  
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。  
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。 
     * @param numbers 需要排序的整型数组
     */
	public static void MaoPaoSort(int[] nums) {

		int size=nums.length;
		int temp=0;
		for (int i = 0; i < size-1; i++) {
			System.out.println(i);
			for (int j = 0; j < size-1-i; j++) {
				if(nums[j]>nums[j+1]) { //交换两数位置
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
//			for (int k = 0; k < nums.length; k++) {
//				//System.out.print(nums[k]+",");
//			}
//			//System.out.println();
//			//System.out.println("====s");
		}
		
	}
	
	//快速排序
	

	/**
	     * 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置
	     * 
	     * @param numbers 带查找数组
	     * @param low   开始位置
	     * @param high  结束位置
	     * @return  中轴所在位置
	     */
	    public static int getMiddle(int[] numbers, int low,int high)
	    {
	        int temp = numbers[low]; //数组的第一个作为中轴
	        while(low < high)
	        {
	        while(low < high && numbers[high] > temp)
	        {
	            high--;
	        }
	        numbers[low] = numbers[high];//比中轴小的记录移到低端
	        while(low < high && numbers[low] < temp)
	        {
	            low++;
	        }
	        numbers[high] = numbers[low] ; //比中轴大的记录移到高端
	        }
	        numbers[low] = temp ; //中轴记录到尾
	        return low ; // 返回中轴的位置
	    }
	public static void main(String[] args) {
		int[] nums= {23,45,212,1,23,32,112,20,11};
		
		Test.MaoPaoSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
	}
}
