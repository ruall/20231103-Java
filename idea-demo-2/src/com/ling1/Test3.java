package com.ling1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个值：");

            arr[i] = sc.nextInt();
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}
