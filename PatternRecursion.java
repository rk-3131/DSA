package com.company;

public class PatternRecursion {
    public static void main(String[] args) {
        triangle(5);
    }

    static void triangle(int n){
        if (n == 0){
            return;
        }

        triangle(n - 1);

        for (int i = n; i >= 0; i--){
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        for (int i = n; i >= 0; i--){
            System.out.print(" ");
        }
        System.out.println();
    }

    static void pattern2(int n ){
        if (n == 0){
            return;
        }

        pattern2(n - 1);

        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    
    static void pattern1(int n){
        if (n == 0){
            return;
        }
        
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        pattern1(n - 1);
    }
}
