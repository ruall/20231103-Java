package com.ling1;

// 使用Arrays工具类

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        int[] arr = {34, 4, 56, 17, 90, 65};

        //排序
        Arrays.sort(arr);
        //二分查找
        int idx = Arrays.binarySearch(arr, 56);
        System.out.println(idx);

        //字符串方式输出数组
        System.out.println(Arrays.toString(arr));

        // 复制数组
        int[] arr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, 4);
        System.out.println(Arrays.toString(arr2));

        // 判断两个数组是否相等
        boolean bool = Arrays.equals(arr, arr1);
        System.out.println(bool);

        //填充数组
        Arrays.fill(arr2, 0);
        System.out.println(Arrays.toString(arr2));
    }
}
