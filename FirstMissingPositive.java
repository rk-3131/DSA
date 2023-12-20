package com.company;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] arr = {7,8,9,11,12};
//        int [] arr = {-1, 6, 2, 4, 1, 5};
        System.out.println(findNumber(arr));
    }

    static int findNumber(int [] arr){
        int i = 0;

        while (i < arr.length){
            if (arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[arr[i] - 1]){
                swap(arr, i, arr[i] - 1);
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j + 1){
                return j + 1;
            }
        }
        return arr.length;
    }
    private static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
