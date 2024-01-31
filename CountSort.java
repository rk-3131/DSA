package com.company;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int [] arr = {5,4,6,2,1,3,8,5,8,7,9,3,5};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
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
