package com.ling1;

// 二维数组
public class Test5 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {11, 20, 10}, {20, 30, 9}};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            int count = arr[i].length;
            for (int j = 0; j < count; j++) {
                sum += arr[i][j];
            }
            int avg = sum / count;
            System.out.println("第" + (i + 1) + "班的平均成绩是：" + avg);
        }
    }
}
