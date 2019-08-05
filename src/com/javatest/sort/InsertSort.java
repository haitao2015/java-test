package com.javatest.sort;

import java.util.Arrays;


/**
 * 直接插入排序  代码
 * 时间复杂度：O（n^2）
 *
 *  @param data
 */
public class InsertSort {

    public  static void insertSort(int[] arr){
        /**
         * 具体流程如下：
         *
         * 1、首先比较数组的前两个数据，并排序；
         *
         * 2、比较第三个元素与前两个排好序的数据，并将第三个元素放入适当的位置；
         *
         * 3、比较第四个元素与前三个排好序的数据，并将第四个元素放入适当的位置；
         *
         * ......
         *
         * 4、直至把最后一个元素放入适当的位置。
         */
        int temp;//
        if(arr.length>1){
            for (int k = 1; k <arr.length ; k++) {
                temp=arr[k];
                //从右往左比较
                int l;
                for ( l = k-1; l>=0  ; l--) {
                    if(arr[l]>temp){ //只要arr[l] >temp  就该右移一个位置；
                        arr[l+1]=arr[l];
                    }else{
                       // arr[l + 1] = temp;
                        break;
                    }
                    System.out.println(k+"    "+Arrays.toString(arr));
                }
                arr[l + 1] = temp;
                System.out.println("  交换后  "+Arrays.toString(arr));

            }

        }
    }

    public static void main(String[] args) {
        int [] arr={10,8,9,7,5,6,3,4,2,1};
        insertSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void insertSort1(int[] arr){
         //直接排序
        int temp;
        int i=1;
        //for (int i = 1; i <arr.length ; i++) {
        while (i<arr.length){
            temp=arr[i];
            int j;
            //for (j = i-1; j >=0 ; j--) {//将所有大于temp的 右移一个位置，给temp找位置
            j = i-1;
            while (j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                    j--;
                }else {
                    break;
                }
            }
            arr[j+1]=temp; //插入到位置;
            i++;
        }
    }
}