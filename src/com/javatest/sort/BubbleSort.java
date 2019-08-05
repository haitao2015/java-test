package com.javatest.sort;

import java.util.Arrays;

/**
 * 冒泡排序  代码
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        //int[] arr=new int[]{23,13,35,21,43,21,2,4,5,32,35,2,1};
        int[] arr=new int[]{1,2,3,9,8};
        //bubbleSortLeftToRiht(arr);
        bubbleSortRihtToLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序  从前往后; 即从左往右；
     * @param arr
     */
    public  static void bubbleSortLeftToRiht(int[] arr){
        if(arr.length>1){
            for (int i = 0; i <arr.length-1 ; i++) {
                for (int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }

    /**
     * 冒泡排序  从后往前; 即从右往左；
     * @param arr
     */
    public  static void bubbleSortRihtToLeft(int[] arr){
        int temp=0;//临时变量；
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+i+"趟：");
            for (int j=arr.length-1;j>i;j--){
                    count++;
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("执行次数："+count);
    }
}