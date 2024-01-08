package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestValueAfterReplacing {
    public static void main(String[] args) {
        System.out.println(smallestValue(4));
    }
//    https://leetcode.com/problems/smallest-value-after-replacing-with-sum-of-prime-factors/
    static public int smallestValue(int n) {

        while (!isPrime(n)){
            List<Integer> list = primeFactors(n);
            int count = 0;
            if (list.size() == 1){
                int temp = list.get(0);
                while (temp < n){
                    temp *= 2;
                    count++;
                }
            }

            if (count == 0){
                n = list.get(0) + list.get(1);
            }else{
                n = (count + 1) * list.get(0);
            }
        }

        return n;
    }
    static List<Integer> primeFactors(int n){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= (n / 2); i++){
            if (n % i == 0 && isPrime(i)){
                if(!list.contains(i)){
                    list.add(i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
    static boolean isPrime(int n){

        int c = 2;

        while (c <= Math.sqrt(n)){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
