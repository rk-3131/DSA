package com.company;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
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
