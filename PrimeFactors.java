package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(primeFactors(70));
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
