package com.ling1;

public class Test {
    public static void main(String[] args) {
        int[] arr = {14, 20, 40, 80, 23, 49, 55, 34, 90, 100, 95};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值是：" + min);
    }
}
