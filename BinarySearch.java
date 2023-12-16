package com.company;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        Binary search is a technique which is used to find the element in the array which is sorted in ascending or descending order

        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearchAsc(arr, 8));
        System.out.println(ordAgnBinarySearch(arr, 8));
        ArraysPractice1 ap = new ArraysPractice1();
        ap.nonStaticReverseArray(arr);
        System.out.println(binarySearchDesc(arr, 8));
        System.out.println(ordAgnBinarySearch(arr, 8));

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
