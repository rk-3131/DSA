package com.company;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        Binary search is a technique which is used to find the element in the array which is sorted in ascending or descending order

        int [] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(binarySearchAsc(arr, 8));
//        System.out.println(ordAgnBinarySearch(arr, 8));
//        System.out.println(binarySearchDesc(arr, 8));
//        System.out.println(ordAgnBinarySearch(arr, 8));

        System.out.println("Normal Binary Search: " + ordAgnBinarySearch(arr, 11));
        System.out.println("Recursive Binary Search: " + binarySearchRecursion(arr, 11));

    }

    static int binarySearchRecursion(int [] arr, int target){
        return helper(0, arr.length - 1, arr, target);
    }
    static int helper(int start, int end, int [] arr, int target){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }
        else if (arr[mid] < target){
            return helper(mid + 1, end, arr, target);
        }

        return helper(start, mid - 1, arr, target);

    }
    static int ordAgnBinarySearch(int [] arr, int target){
        if (arr[0] < arr[arr.length - 1]){
//            ascending array
            return binarySearchAsc(arr, target);
        }else{
            return binarySearchDesc(arr, target);
        }
    }
    static int binarySearchDesc(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearchAsc(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
