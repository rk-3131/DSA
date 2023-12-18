package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
//        int [] arr = {5,56,54,16,1,2,1,2,5,4,8,5,555,5};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int [] arr){

        int i = 0;

        while (i < arr.length){
            if (arr[i] != i + 1){
                swap(arr, i, arr[i] - 1);
            }else{
                i++;
            }
        }
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}