package com.company;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int [] arr = {5,4,6,2,1,3,8,5,8,7,9,3,5};
        System.out.println("Array number 1 before sorting: " + Arrays.toString(arr));
        countSort(arr);
        System.out.println("Array number 1 after sorting: "+ Arrays.toString(arr));

        int [] arr2 = {6,5,4,2,3,9,8,7,1,2,3,5,4,6};
        System.out.println("Array number 2 before sorting: " + Arrays.toString(arr2));
        myCountSort(arr2);
        System.out.println("Array number 2 after sorting: " + Arrays.toString(arr2));
    }

    static void myCountSort(int [] arr){
//        find the max element in the given array so that we can make the same size array as of the largest element in the array

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }

//        Now lets just create the array of that size as of the maximum element in the array

        int [] temp = new int[max + 1];

//        Now store the frequency of each of the number which is present in the array

        for (int i = 0; i < arr.length; i++){
            temp[arr[i]]++;
        }

//        Now that we have the frequency of each item in the array then we can then make use of it
        int index = 0;
        for (int i = 0; i < temp.length; i++){
            while (temp[i] > 0){
                arr[index] = i;
                index++;
                temp[i]--;
            }
        }
    }
    static void countSort(int [] arr){
//        This is useful to the array where numbers are in the smaller values
//        If numbers have larger values in the array then it will be much harder for anyone to have then it is sorted
//        As we will require large array and hence it will use larger space

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }

        int [] temp = new int[max + 1];

        for (int i = 0; i < arr.length; i++){
            temp[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < temp.length; i++){
            while (temp[i] > 0){
                arr[index] = i;
                index++;
                temp[i]--;
            }
        }
    }
}
