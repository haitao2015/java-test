package com.javatest.test;

import java.io.File;
/***
 * 指定目录下的文件显示
 * @author Administrator
 *
 */
public class FileTest {
	
	public static void main(String[] args) {
        String path = "D:\\我的资料（海涛）";
        test(path);
    }
    private static void test(String path) {
        File f = new File(path);
        File[] fs = f.listFiles();
        
        if (fs == null) {
            return;
        }
        for (File file : fs) {
            if (file.isFile()) {//判断是不是文件；是则输出文件路径，不是则继续递归遍历子目录
                System.out.println(file.getPath());
            } else {//
                test(file.getPath());
            }
        }
    }
}
