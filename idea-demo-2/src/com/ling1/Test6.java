package com.ling1;

/**
 * 冒泡排序
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr = {34, 4, 56, 17, 90, 65};

        // 外循环控制轮数
        for (int i = 0; i < arr.length - 1; i++) { //比较的轮数=数列的长度-1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    arr[j] = arr[j] + arr[j + 1];
//                    arr[j + 1] = arr[j] - arr[j + 1];
//                    arr[j] = arr[j] - arr[j + 1];
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/**
 * 34 4 56 17 90 65
 * 4 34 17 56 65 90  // 第二轮 比较5次
 * 4 17 34 56 65     // 第三轮 比较4次
 * 4 17 34 56        // 第三轮 比较3次
 * 4 17 34           // 第四轮 比较2次
 * 4 17              // 第五轮 比较1次
 */
