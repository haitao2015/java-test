package com.javatest.sort;

public class SortDemo01 {
    public static void main(String[] args) {
        int[] objArry={90,12,23,245,34,23,24,45,45,78,68,90,664,56,345,40,34};
        //
        System.out.println("====================快速排序=================");
        QuickSort.quickSort(objArry,0,objArry.length-1);
        //quickSort2(objArry,0,objArry.length-1);
        for (int i = 0; i < objArry.length; i++) {
            System.out.print(objArry[i]+"   ,");
        }
        System.out.println("=====================================");
    }
    //冒泡法排序
    public static void MaoPaoSort(int[] arr){

    }
    /**
     * 快速排序  （背写一遍，实现代码；）
     * @param arr
     * @param low
     * @param high
     */
    public static  void quickSort2(int[] arr, int low,int high){
        int i,j;
        int temp;// 基数
        if(low>high){//必须low>high 时不在执行。
            return ;
        }
        temp=arr[low];// low; 默认为数组第一个数；
        i=low;//0;
        j=high;//arr.length-1;
        while (i<j){

            //i等j停止在走；
            while(i<j && temp>=arr[i]){
                i++;
            }
            //j先移动；
            while(i<j && temp<=arr[j]){
                j--;
            }
            //左右交换数据；
            if(i<j){
                int z,y;
                z=arr[i];
                y=arr[j];
                arr[i]=y;
                arr[j]=z;
            }
        }
        //当i==j时 交互   基数temp 与arr[i]或arr[j] 的数；
        arr[low]=arr[i];
        arr[i]=temp;
        /**
         * 递归调用
         */
        //左；
        quickSort2(arr,low,i-1);
        //右；
        quickSort2(arr,i+1,high);
    }

}

