package com.ling1;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

//        Random r = new Random();
//        int idx = r.nextInt(arr.length);
//
//        // 第一次交换
//        int tmp = arr[0];
//        arr[0] = arr[idx];
//        arr[idx] = tmp;
//
//        //第二次交换
//        idx = r.nextInt(arr.length);
//        tmp = arr[1];
//        arr[1] = arr[idx];
//        arr[idx] = tmp;

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int idx = r.nextInt(arr.length);
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
