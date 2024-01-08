package com.company;
//https://leetcode.com/problems/happy-number/description/


public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    static boolean isHappy(int n){
//        Here happy number is the number which has after kept on adding the number with the sum of square of all the digit is 1
        int slow = n;
        int fast = n;

        do {
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }while (slow != fast);

        return slow == 1;
    }

    static int getSum(int n){

        int ans = 0;

        while (n > 0){
            int rem = n % 10;
            ans += (rem * rem);
            n /= 10;
        }
        return ans;
    }
}
