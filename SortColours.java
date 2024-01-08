package com.company;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,1,2,0,1,2,1,0,2,1,0,0,1,0};
        System.out.println(Arrays.toString(arr));
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sortColors(int [] arr){
        int index = 0;
        int low = 0;
        int high = arr.length - 1;

        while (index <= high){
            if (arr[index] == 0){
                int temp = arr[index];
                arr[index] = arr[low];
                arr[low] = temp;
                index++;
                low++;
            }else if (arr[index] == 2){
                int temp = arr[index];
                arr[index] = arr[high];
                arr[high] = temp;
                high--;
//                index++;
            }else {
                index++;
            }
        }
    }
}
