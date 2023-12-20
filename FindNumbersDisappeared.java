package com.company;

import java.util.ArrayList;
import java.util.List;

public class FindNumbersDisappeared {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findNumbers(arr));
    }
    static List<Integer> findNumbers(int [] arr){
        int i = 0;

        while (i < arr.length){
            if (arr[i] == arr[arr[i] - 1]){
                i++;
            }
            else if (arr[i] != i + 1){
                swap(arr, i, arr[i] - 1);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j + 1){
                ans.add(j + 1);
            }
        }

        return ans;
    }
    static private void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
