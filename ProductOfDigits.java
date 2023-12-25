package com.company;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(12345));
    }
    static int product(int n){
        if (n == 0){
            return 1;
        }

        int remainder = n % 10;

        return remainder * product(n / 10);
    }
}
