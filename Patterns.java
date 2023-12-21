package com.company;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md


public class Patterns {
    public static void main(String[] args) {
        pattern14(5);
    }
    static void pattern14(int n){
        for (int i = 0; i < 2 * n - 2; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("s");
            }

            for (int j = 0; j <= n - i - 1; j++){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){

            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for (int i = 0; i < n -1; i++){
            for (int j = 1; j < n - i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j < n - i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int j = 0; j < 2 * n - 2; j++){
            System.out.print("*");
        }
    }
    static void pattern12_2(int n){
        for (int i = 0; i < 2 * n; i++){
            if (i < 5){
                for (int j = n; j > n - i; j--){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * n - 2 * i; j++){
                    if (j % 2 == 0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < n - i; j++){
                    System.out.print(" ");
                }
                System.out.println();
            }else{
                for (int j = 0; j < 2 * n - i - 1; j++){
                    System.out.print(" ");
                }

                for (int j = 0; j <= i - n; j++){
                    System.out.print("* ");
                }

                for (int j = 0; j < 2 * n - i - 1; j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    static void pattern12(int n){
        pattern11(5);
        pattern10(5);
    }
    static void pattern11(int n){
        for (int i = n; i > 0; i--){
            for (int j = n; j > i - 1; j--){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++){
                if (j % 2 != 0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            for (int j = n; j > i - 1; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i = n; i > 0; i--){
            for (int j = 0; j < i - 1; j++){
                System.out.print(" ");
            }

            for (int j = 2 * n; j > 2 * i - 1; j--){
                if (j % 2 == 0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = n; i > 0; i--){
            for (int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--){
                System.out.print("*");
            }
            for (int j = n; j >= i; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i = n; i > 0; i--){
            for (int j = 0; j < i - 1; j++){
                System.out.print(" ");
            }
            for (int j = 2 * n - 1; j >= 2 * i - 1; j--){
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = n; i > 0; i--){
            for (int j = 0; j < n - i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = n; i > 0; i--){
            for (int j = 1; j < i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j < n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5_2(int n){
        for (int i = 0; i < 2 * n - 1; i++){
            if (i < n){
                for (int j = 0; j <= i; j++){
                    System.out.print("* ");
                }
            }else{
                for (int j = 2 * n - i - 1; j >= 1; j--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        pattern2(n);
        pattern3(n - 1);
    }
    static void pattern4(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = n; i >= 1; i--){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
