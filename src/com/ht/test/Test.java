package com.ht.test;



public class Test {
	/**
     * ð������
     * �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������  
     * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������  
     * ������е�Ԫ���ظ����ϵĲ��裬�������һ����
     * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ� 
     * @param numbers ��Ҫ�������������
     */
	public static void MaoPaoSort(int[] nums) {

		int size=nums.length;
		int temp=0;
		for (int i = 0; i < size-1; i++) {
			System.out.println(i);
			for (int j = 0; j < size-1-i; j++) {
				if(nums[j]>nums[j+1]) { //��������λ��
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
	
	//��������
	

	/**
	     * ���ҳ����ᣨĬ�������λlow������numbers�������������λ��
	     * 
	     * @param numbers ����������
	     * @param low   ��ʼλ��
	     * @param high  ����λ��
	     * @return  ��������λ��
	     */
	    public static int getMiddle(int[] numbers, int low,int high)
	    {
	        int temp = numbers[low]; //����ĵ�һ����Ϊ����
	        while(low < high)
	        {
	        while(low < high && numbers[high] > temp)
	        {
	            high--;
	        }
	        numbers[low] = numbers[high];//������С�ļ�¼�Ƶ��Ͷ�
	        while(low < high && numbers[low] < temp)
	        {
	            low++;
	        }
	        numbers[high] = numbers[low] ; //�������ļ�¼�Ƶ��߶�
	        }
	        numbers[low] = temp ; //�����¼��β
	        return low ; // ���������λ��
	    }
	public static void main(String[] args) {
		int[] nums= {23,45,212,1,23,32,112,20,11};
		
		Test.MaoPaoSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
	}
}
