package com.ling1;

// 选择排序
public class Test7 {
    public static void main(String[] args) {
        int[] arr = {34, 4, 56, 17, 90, 65};

        int minIndex = 0; // 用于记录每次比较的最小值下标
        //控制轮数
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;// 每轮假设一个最小值下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // 判断需要交换的数下标是否为自身
            if (minIndex != i) {
                int tmp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = tmp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


/**
 * 34 4 56 17 90 65
 * 4 34 56 17 90 65  // 第二轮 比较5次
 * 4 17 56 34 90 65  // 第三轮 比较4次
 * 4 17 34 56 90 65  // 第三轮 比较3次
 * 4 17 34 56 90 65  // 第四轮 比较2次
 * 4 17 34 56 65 90  // 第五轮 比较1次
 */