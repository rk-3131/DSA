package com.company;

public class IsArraySorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int [] arr){
        return helper(arr, 0);
    }
    static boolean helper(int [] arr, int start){
        if (start == arr.length - 1){
            return true;
        }

        if (arr[start] > arr[start + 1]){
            return false;
        }

        return helper(arr, start + 1);
    }
}
