package com.company;

public class RotatedBinarySearchRecursion {
    public static void main(String[] args) {
        int [] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(bSearch(arr, 6, 0, arr.length - 1));
    }

    static int bSearch(int [] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }

        if (arr[mid] < arr[end]){
            if (arr[mid] < target && arr[end] > target){
                return bSearch(arr, target, mid + 1, end);
            }else{
                return bSearch(arr, target, start, mid - 1);
            }
        }else{
            if (arr[mid] > target && arr[start] <= target){
                return bSearch(arr, target, start, mid - 1);
            }else{
                return bSearch(arr, target, mid + 1, end);
            }
        }
    }

}
