package com.javatest.sort;

import java.util.Arrays;

/**
 * �?单�?�择排序  代码
 *对于给定的一组记录，经过第一轮比较后得到�?小的记录，然后将该记录的位置与第�?个记录的位置交换；接�?对不包括第一个记�?
 * 以外的其他记录进行第二次比较，得到最小记录并与第二个位置记录交换；重复该过程，知道进行比较的记录只剩下一个为止�??
 */

public class SelectSort {

    public static void main(String[] args) {
        int [] arr={10,8,9,7,5,6,3,4,2,1};
        selectSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    //选择排序
    public  static void selectSort1(int[] arr){
        int index=0;
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            index=0;
            temp=arr[i];
            for (int j = i+1; j<arr.length ; j++) {
                if(temp>arr[j]){
                    temp=arr[j];
                    index=j;
                }
            }
            if(i<index){
                arr[index]=arr[i];
                arr[i]=temp;

            }
        }
    }
}
