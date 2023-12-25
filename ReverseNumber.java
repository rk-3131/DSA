package com.company;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(countZeroes(1232000, 0));
    }

    static int countZeroes(int n, int ans){
        if (n <= 0){
            return ans;
        }

        int rem = n % 10;

        if (rem == 0){
            return countZeroes(n / 10, ans + 1);
        }

        return countZeroes(n / 10, ans);
    }

    static boolean isPalindrome(int n){
        return n == reverseNumber(n, 0);
    }

    static int reverseNumber(int n){
        if (n == 0){
            return 0;
        }

        int rem = n % 10;

        return rem * 10 + reverseNumber(n / 10);
    }

    static int reverseNumber(int n, int ans){
        if (n == 0){
            return ans;
        }

        int rem = n % 10;

        ans = ans * 10 + rem;

        return reverseNumber(n / 10, ans);
    }

    static String reverseNumber(int n, StringBuilder sb){
        if (n == 0){
            return sb.toString();
        }

        int rem = n % 10;

        sb.append(Integer.toString(rem));

        return reverseNumber(n / 10, sb);
    }
}
