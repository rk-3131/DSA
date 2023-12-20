package com.company;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(duplicatesInRange(arr));
    }
    static List<Integer> duplicatesInRange(int [] arr){
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;

        while (i < arr.length){
            if (arr[i] == arr[arr[i] - 1]){
                i++;
            }else{
                swap(arr, i, arr[i] - 1);
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j + 1){
                ans.add(arr[j]);
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
