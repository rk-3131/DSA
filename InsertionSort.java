package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int [] arr = {5,4,3,2,1};
        int [] arr = {5,56,54,16,1,2,1,2,5,4,8,5,555,5};
        System.out.println("Array number 1 before sorting: "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array number 2 after sorting: "+Arrays.toString(arr));


        int [] arr2 = {8,7,6,5,4,3,2,1};
        System.out.println("Array Number 2 before starting: " + Arrays.toString(arr2));
        myInsertionSort(arr2);
        System.out.println("Array number 2 after sorting: " + Arrays.toString(arr2));
    }

    static void myInsertionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int j = i + 1;

            while (j > 0){
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j- 1);
                }
                j--;
            }
        }
    }
//    5 4 3 2 1
    static void insertionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int j = i + 1;
            while (j > 0){
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
                j--;
            }
        }
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
