package com.company;

public class ProductOf1ToN {
    public static void main(String[] args) {
        System.out.println(product(5));
    }
    static private int product(int n){
        if (n == 1){
            return n;
        }

        return n * product(n - 1);
    }
}
