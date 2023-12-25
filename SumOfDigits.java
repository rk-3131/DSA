package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 345;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n == 0){
            return 0;
        }

        int remainder = n % 10;

        return remainder + sum(n / 10);
    }
}
