package com.javatest.sort;

/**
 * 快速排序  代码     高快省的排序算法
 *
 */
public class QuickSort {
    /**
     * 快速排序（Quicksort）是对冒泡排序的一种改进。
     * 快速排序由C. A. R. Hoare在1960年提出。
     * 它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
     * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
     */
    public  static void quickSort(int[] arr,int low,int high){
        int i,j,temp;
        i=low;
        j=high;
        if(i>j){
            return ;
        }
        temp =arr[low];//基准数
        while (i<j){
            //先看右边，依次往左递减
            //#先从右往左找一个小于 基准位的数
            //#当右边的哨兵位置所在的数>基准位的数 时
            //#继续从右往左找（同时 j 索引-1）
            //#找到后会跳出 while循环
            while (temp<=arr[j] && i<j){
                j--;
            }
            //再看左边，依次往右递增
            //#步骤和上面类似
            //在看左边，依次往右递增
            //#先从左往右找一个小于 基准位的数
            //#当右边的哨兵位置所在的数>基准位的数 时
            //#继续从右往左找（同时 j 索引-1）
            //#找到后会跳出 while循环
            while (temp>=arr[i] && i<j){
                i++;
            }
            //交换当前i,j哨兵发现的数据；
            if(i<j){// 只要i<j;
              //  #z、y 都是临时参数，用于存放 左右哨兵 所在位置的数据
             int  z= arr[i];
             int  y= arr[j];
              // # 左右哨兵 交换数据（互相持有对方的数据）
               arr[i]=y;
               arr[j]=z;
            }
        }
        //当i==j 时 说明i，j 哨兵相遇了，这时交互，基数数据和哨兵位数据；
        arr[low]=arr[i];//或 arr[low]=arr[j];
        arr[i]=temp;//或 arr[j]=temp;
        //#i=j
        //#这时  左半数组<(i或j所在索引的数)<右半数组
        //#也就是说(i或j所在索引的数)已经确定排序位置， 所以就不用再排序了，
        //# 只要用相同的方法 分别处理  左右数组就可以了
        //递归调用左半数组
        quickSort(arr,low,j-1);
        //递归调用右半数组
        quickSort(arr,j+1,high);
    }
    public  static void quickSort(float[] arr,int low,int high){
        float temp;
        int i,j;
        i=low;
        j=high;
        if(i>j){
            return ;
        }
        temp =arr[low];//基准数
        while (i<j){
            //先看右边，依次往左递减
            //#先从右往左找一个小于 基准位的数
            //#当右边的哨兵位置所在的数>基准位的数 时
            //#继续从右往左找（同时 j 索引-1）
            //#找到后会跳出 while循环
            while (temp<=arr[j] && i<j){
                j--;
            }
            //再看左边，依次往右递增
            //#步骤和上面类似
            //在看左边，依次往右递增
            //#先从左往右找一个小于 基准位的数
            //#当右边的哨兵位置所在的数>基准位的数 时
            //#继续从右往左找（同时 j 索引-1）
            //#找到后会跳出 while循环
            while (temp>=arr[i] && i<j){
                i++;
            }
            //交换当前i,j哨兵发现的数据；
            if(i<j){// 只要i<j;
                //  #z、y 都是临时参数，用于存放 左右哨兵 所在位置的数据
                float  z= arr[i];
                float  y= arr[j];
                // # 左右哨兵 交换数据（互相持有对方的数据）
                arr[i]=y;
                arr[j]=z;
            }
        }
        //当i==j 时 说明i，j 哨兵相遇了，这时交互，基数数据和哨兵位数据；
        arr[low]=arr[i];//或 arr[low]=arr[j];
        arr[i]=temp;//或 arr[j]=temp;
        //#i=j
        //#这时  左半数组<(i或j所在索引的数)<右半数组
        //#也就是说(i或j所在索引的数)已经确定排序位置， 所以就不用再排序了，
        //# 只要用相同的方法 分别处理  左右数组就可以了
        //递归调用左半数组
        quickSort(arr,low,j-1);
        //递归调用右半数组
        quickSort(arr,j+1,high);
    }
    public  static void quickSort(long[] arr,int low,int high){
        long temp;
        int i,j;
        i=low;
        j=high;
        if(i>j){
            return ;
        }
        temp =arr[low];//基准数
        while (i<j){
            //先看右边，依次往左递减
            //#先从右往左找一个小于 基准位的数
            //#当右边的哨兵位置所在的数>基准位的数 时
            //#继续从右往左找（同时 j 索引-1）
            //#找到后会跳出 while循环
            while (temp<=arr[j] && i<j){
                j--;
            }
            //再看左边，依次往右递增
            //#步骤和上面类似
            //在看左边，依次往右递增
            //#先从左往右找一个小于 基准位的数
            //#当右边的哨兵位置所在的数>基准位的数 时
            //#继续从右往左找（同时 j 索引-1）
            //#找到后会跳出 while循环
            while (temp>=arr[i] && i<j){
                i++;
            }
            //交换当前i,j哨兵发现的数据；
            if(i<j){// 只要i<j;
                //  #z、y 都是临时参数，用于存放 左右哨兵 所在位置的数据
                long  z= arr[i];
                long  y= arr[j];
                // # 左右哨兵 交换数据（互相持有对方的数据）
                arr[i]=y;
                arr[j]=z;
            }
        }
        //当i==j 时 说明i，j 哨兵相遇了，这时交互，基数数据和哨兵位数据；
        arr[low]=arr[i];//或 arr[low]=arr[j];
        arr[i]=temp;//或 arr[j]=temp;
        //#i=j
        //#这时  左半数组<(i或j所在索引的数)<右半数组
        //#也就是说(i或j所在索引的数)已经确定排序位置， 所以就不用再排序了，
        //# 只要用相同的方法 分别处理  左右数组就可以了
        //递归调用左半数组
        quickSort(arr,low,j-1);
        //递归调用右半数组
        quickSort(arr,j+1,high);
    }
}
