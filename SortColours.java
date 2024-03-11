package com.company;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
//        int [] arr = {0,1,2,0,1,2,0,1,2,1,0,2,1,0,0,1,0};
//        System.out.println(Arrays.toString(arr));
////        sortColors(arr);
////        bubbleSort(arr);
//        insertionSort(arr);
////        System.out.println(Arrays.toString(arr));
//        noJustTest(1,2,3,4,5,6,7,8,9,10);
        System.out.println(isArmstrong(158));

    }
    static boolean isArmstrong(int n){
        int temp = n;
        int ans = 0;

        while (temp > 0){
            int rem = temp % 10;
            ans += (rem * rem * rem);
            temp /= 10;
        }

        return (ans == n);
    }
    static void noJustTest(int ... arr){
        System.out.println("This is the function which will take the arguments in the form of an array");
        for (int n : arr){
            System.out.println(n);
        }
    }
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
    static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
