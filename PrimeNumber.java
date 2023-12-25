package com.company;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {

    }

    static List<Integer> listOfPrime(int end){
        boolean [] arr = new boolean[end + 1];

        int i = 2;

        while (i * i <= end){
            if (isPrime2(i)){
                int j = 2 * i;
                while (j < arr.length){
                    arr[j] = true;
                    j += i;
                }
            }
            i++;
        }
        List<Integer> list = new ArrayList<Integer>();

        for (int j = 2; j < arr.length; j++){
            if (arr[j] == false){
                list.add(j);
            }
        }

        return list;
    }

    static boolean isPrime2(int n){
        if (n <= 1){
            return false;
        }
        int i = 2;

        while (i * i <= n){
            if (n % i == 0){
                return false;
            }
            i++;
        }

        return true;
    }

    static boolean isPrime1(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
