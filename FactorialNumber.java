package com.company;

public class FactorialNumber {
    public static void main(String[] args) {
//        System.out.println(fact(5));
        System.out.println(isFact(3));
    }
//    static boolean isFact2(int n){
//        if ()
//    }
    static boolean isFact(int n){
        int ans = 1;
        int index = 1;

        while (ans < n){
            ans *= index;
            index++;
        }

        return ans == n;
    }
    static int fact(int n){
        if (n == 1){
            return 1;
        }

        return n * fact(n - 1);
    }
}
