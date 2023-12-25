package com.company;

public class StrictlyPalindrome {
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(9));
    }
    static public boolean isStrictlyPalindromic(int n) {
//        https://leetcode.com/problems/strictly-palindromic-number/description/
        for (int i = 2; i <= n - 2; i++){
            int base = i;
            int temp = n;
            StringBuilder sb = new StringBuilder();

            while (temp > 0){
                int rem = temp % base;
                temp /= base;
                sb.append(Integer.toString(rem));
            }

            int start = 0;
            int end = sb.length() - 1;

            while (start <= end){
                if (sb.charAt(start) != sb.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
