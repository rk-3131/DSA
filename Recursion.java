package com.company;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
//        System.out.println(fibonacciNumber(8));
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int ans = binarySearch(arr, 8, 0, arr.length - 1);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }else if (arr[mid] < target){
            return binarySearch(arr, target, mid + 1, end);
        }

        return binarySearch(arr, target, start, end - 1);
    }
    static int fibonacciNumber(int n){
        if (n == 0 || n == 1){
            return n;
        }

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
    static void printNto1(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    static void print1ToN(int n){
        if (n == 0){
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }
    static void message(int n){
        if (n == 0){
            return;
        }
        System.out.println("Hello World");
        message(n - 1);
    }

}
