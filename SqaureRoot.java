package com.company;

public class SqaureRoot {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
            System.out.println(i + "-->" + squareRoot(i));
        }
        for (int i = 1; i < 101; i++){
            System.out.print(i);
            System.out.printf("--> %.2f%n" , exactSquareRoot(i));
        }
    }

    static double exactSquareRoot(int n){
        double exactAns = squareRoot(n);

        if (exactAns * exactAns == n){
            return (double) exactAns;
        }

        while (exactAns * exactAns < n){
            exactAns += 0.1;
        }

        return exactAns - 0.1;
    }
    static int squareRoot(int n){
        int start = 1;
        int end = n;

        while (start <= end){
            int mid = start + (end - start ) / 2;

            if (mid * mid == n){
                return mid;
            }else if (mid * mid < n){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return end;
    }
}
