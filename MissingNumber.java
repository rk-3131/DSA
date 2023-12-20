package com.company;

import java.math.BigInteger;
import java.util.Arrays;
//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(Arrays.toString(arr));
        int ans = missingNumber2(arr);
        System.out.println("Missing number in the array if it was in the range is " + ans);
    }
    static int missingNumberUsingBigInteger(int [] arr){
        BigInteger i1 = BigInteger.valueOf((arr.length * (arr.length + 1)) / 2);

        BigInteger i2 = BigInteger.ZERO;

        for (int i = 0; i < arr.length; i++){
            i2 = i2.add(BigInteger.valueOf(arr[i]));
        }

        BigInteger diff = i1.subtract(i2);

        return diff.intValue();
    }
    static int missingNumber2(int [] arr){
//       4 0 2 1
        int i = 0;
        while (i < arr.length){
            if (arr[i] == arr.length){
                i++;
            }else if (arr[i] != i){
                swap(arr, i, arr[i]);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int [] arr, int i, int j){
        if (j == arr.length){
            j = arr.length - 1;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int missingNumber(int [] arr){
        int [] temp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++){
            temp[arr[i]] = 1;
        }

        for (int i = 0; i < temp.length; i++){
            if (temp[i] == 0){
                return i;
            }
        }

        return -1;
    }

}
