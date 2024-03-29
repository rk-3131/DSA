package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        System.out.println("First array before sorting: "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("First array after the sorting: "+ Arrays.toString(arr));

        int [] arr2 = {100,90,80,70,60,50,40,30,20,10};
        System.out.println("Second array before sorting: " + Arrays.toString(arr2));
        myBubbleSort(arr2);
        System.out.println("Second array after sorting: " + Arrays.toString(arr2));
    }
    static void myBubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++){
            boolean flag = true;
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    flag = false;
                    swap(arr, j, j+ 1);
                }
            }
            if (flag){
                return;
            }
        }
    }
    static void bubbleSort(int [] arr){
//        first just get the outer loop which will iterate over the array and hence it will be helpful to get the every element traversed at least once
//        5 4 3 2 1
        for (int i = 0; i < arr.length; i++){
//            outer loop is used to get every iteration for all the possible elements in the array
            boolean isSorted = true;
//            This is kind of flag which will tell if the array is already sorted or not
//            If the array is already sorted then it will tell at the end of that iteration as there will be no swaps
//            And hence further iterations will also be avoided hence improving the time complexity for the already sorted array
            for (int j = 0; j < arr.length - i - 1; j++){
//                This loop goes from first element to the end of the unsorted array
//                at first iteration it will be going to the end of the array and the iteration will now reduce to as low as only 2 elements
//                Hence for every increasing value of 'i' the array will get on sorting from the last element
                if (arr[j] > arr[j + 1]){
                    isSorted = false;
                    swap(arr, j, j + 1);
                }
            }
            if (isSorted == true){
                return;
            }
        }
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
