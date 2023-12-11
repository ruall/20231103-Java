package com.ling1;

//二分查找法
public class Test8 {
    public static void main(String[] args) {
        // 必须保证数列是有序的
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = binarySearch(arr, 11);
        System.out.println(index);
    }

    // 二分查找算法 x:查找的数列 key:需要查找的值
    public static int binarySearch(int[] arr, int key) {
        int str = 0; //开始下标
        int end = arr.length - 1; //结束下标
        while (str <= end) {
            int mid = (str + end) / 2; // 简写：>>>1
            if (arr[mid] < key) {
                str = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
