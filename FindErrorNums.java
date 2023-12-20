package com.company;

import java.util.Arrays;

public class FindErrorNums {
    public static void main(String[] args) {
//        https://leetcode.com/problems/set-mismatch/
        int [] arr = {1,2,2,4};

        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int [] findErrorNums(int [] arr){
        int i = 0;

        while (i < arr.length){
            if (arr[i] == arr[arr[i] - 1]){
                i++;
            }else{
                swap(arr, i, arr[i] - 1);
            }
        }

        int [] ans = new int[2];

        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j + 1){
                ans[0] = arr[j];
                ans[1] = j + 1;
            }
        }

        return ans;
    }
    private static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
