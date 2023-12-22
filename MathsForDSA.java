package com.company;

import java.util.Map;

public class MathsForDSA {
    public static void main(String[] args) {
        System.out.println(convertEvenBitToZero(10));
    }

    static int findCompliment(int n){

    }

    static long convertEvenBitToZero(long n) {
        int i = 1;
        int count = 0;

        while (i <= n){
            if (count % 2 == 0){
                n = (n & i);
            }
            count++;
            i = i * 2;
        }

        return n;
    }

    static int setBit(int N){
//        https://practice.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1
        int i = 1;

        while (i < N && (i & N) != 0){
            i = i * 2;
        }

        return N | i;
    }

    public static int getFirstSetBit(int n){
//        https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1
        int ans = 0;
        int i = 1;

        while ((i & n) != i){
            i = i * 2;
            ans++;
        }

        return ans + 1;
    }
    static int findPosition(int N) {
//        https://practice.geeksforgeeks.org/problems/find-position-of-set-bit3706/1
        int i = 1;
        int count = 1;

        int ans = 0;

        while (i < N){
            i = i * 2;
            count++;
        }

        if (i == N){
            return count;
        }

        return -1;
    }

    static int ithBitOfnumber(int n, int i){
//        https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1
//        Above question is same but the indexing there is done using 0 indexed system
//        But the solution here is adjusted according to the 1 indexed indexing system.
        int cover = 1 << (i - 1);

        if ((n & cover) == cover){
            return 1;
        }
        return 0;
    }
    static String findOddEven(int n){
//        we know the numbers binary representation is given in the form of 1 0 1 0 1 0
//        Here all the terms except first term from the right are in the power of 2
//        we all know that sum of even number will always be declared as the even
//        Hence it the last set bit that will determine if the number is odd or even
//        Hence if the last bit is 1 the number is odd and if it is 0 the number is even

        if ((n & 1) == 0){
            return "Even";
        }
        return "Odd";
    }

    static int singleNumber(int [] arr){
//        https://leetcode.com/problems/single-number/description/

        int ans = 0;

        for (int n : arr) {
            ans ^= n;
        }

        return ans;
    }

    static int singleNumber2(int [] nums){

        return -1;
    }
}
