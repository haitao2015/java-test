package com.javatest.sort;

import java.util.Arrays;

/**
 * 归并排序，算法
 * 归并排序（MERGE-SORT）是建立在归并操作上的一种有效的排序算法,该算法是采用分治法（Divide and Conquer）的
 * 一个非常典型的应用。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。
 * 若将两个有序表合并成一个有序表，称为二路归并。
 */
public class MergeSort {

        public static void main(String []args){
            int []arr = {9,8,7,6,5,4,3,2,1};
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static void sort(int []arr){
            int []temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
            sort(arr,0,arr.length-1,temp);
        }
        private static void sort(int[] arr,int left,int right,int []temp){
            if(left<right){
                int mid = (left+right)/2;
                sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
                sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
                merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
            }
        }
        private static void merge(int[] arr,int left,int mid,int right,int[] temp){
            int i = left;//左序列指针
            int j = mid+1;//右序列指针
            int t = 0;//临时数组指针
            while (i<=mid && j<=right){//同时满足;
                if(arr[i]<=arr[j]){
                    temp[t++] = arr[i++];
                }else {
                    temp[t++] = arr[j++];
                }
            }
            while(i<=mid){//将左边剩余元素填充进temp中
                temp[t++] = arr[i++];
            }
            while(j<=right){//将右序列剩余元素填充进temp中
                temp[t++] = arr[j++];
            }
            System.out.println("temp:"+Arrays.toString(temp));
            System.out.println("arr:"+Arrays.toString(arr));
            t = 0;
            //将temp中的元素全部拷贝到原数组中
            while(left <= right){
                arr[left++] = temp[t++];
            }
        }
    }
