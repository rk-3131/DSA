package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,56,54,16,1,2,1,2,5,4,8,5,555,5};
//        int [] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selectionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
//    5 4 3 2 1
    static void selectionSort2(int [] arr){
        for (int i = arr.length - 1; i >= 0; i--){
            int minNumber = arr[arr.length - 1];
            int minIndex = arr.length - 1;

            int j = arr.length - 2;

            while (j >= arr.length - i - 1){
                if (arr[j] < minNumber){
                    minNumber = arr[j];
                    minIndex = j;
                }
                j--;
            }

            swap(arr, minIndex, j + 1);
        }
    }
    static void selectionSort1(int [] arr){
//        Selection sort is same as that of the bubble sort algorithm
//        But we dont make swap operations too often here
//        For every iteration we just find the number which is larger than that of other number and hence those number can be used to then swap at the end of the iteration
//        Hence in this code we keep on sorting the array from the last of the elements
//        In the selectionSort2 I have made changes so that they can be used to get sorted array but here sorting starts from the very first element
        for (int i = 0; i < arr.length; i++){
            int maxNumber = arr[0];
            int maxIndex = 0;
            int j = 1;
            while (j < arr.length - i){
                if (maxNumber < arr[j]){
                    maxIndex = j;
                    maxNumber = arr[j];
                }
                j++;
            }
            swap(arr, maxIndex, j - 1);
        }
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
