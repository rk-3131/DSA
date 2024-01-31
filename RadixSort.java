package com.company;

public class RadixSort {
    public static void main(String[] args) {

    }
    static void radixSort(int [] arr){
//        This is the method which is used to sort the number which are much larger in their values
//        Here we can use the concept of count sort and by using which we can then sort the numbers in the array
//        Number should not be decimal and they should not be negative
//        Just get the maximum number in the array
//        Find the number of digits in the maximum number
//        Apply count sort to the array that many number of times as there are digits there

//        get the maximum number in the array
        int max = Integer.MIN_VALUE;
        for (int n : arr){
            max = Math.max(max, n);
        }

//        find the number of digits in the maximum number

        int digits = 0;
        while (max > 0){
            max /= 10;
            digits++;
        }

        for (int i = 1; i < digits; i*=10){
            countSort(arr, i);
        }

    }
    static void countSort(int [] arr, int power){
        int maxDigit = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];
            int index = 0;
            int dig = temp % 10;
            while (index < power && temp > 0){
                dig = temp % 10;
                temp /= 10;
                index++;
            }
            maxDigit = Math.max(dig, maxDigit);
        }
    }
}
