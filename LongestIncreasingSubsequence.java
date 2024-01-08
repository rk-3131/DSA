package com.company;
//https://leetcode.com/problems/longest-increasing-subsequence/description/

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }
    static public int lengthOfLIS(int[] nums) {

//        Lets create the array which will work for our dynamic programing approach
        int [] dp = new int[nums.length];
//        This array will be filled such that it will have number which will describe the number of elements in the array which were increasing
//        Hence we will have a simple logic

        for (int i = 1; i < nums.length; i++){
//            This outer loop will be used to fill up the array
//            Number of elements which are greater than each other in the subsequence will be put up there
//            We could have started the i from 0 but the subsequence first will not have any impact as its value will always be 1
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                    This is simple logic where we will update the dp's element based on the maximum value it has right now to the maximum value it can get later on
                }
            }
        }

        int ans = Integer.MIN_VALUE;

        for (int n : dp){
            ans = Math.max(n, ans);
        }

        return ans + 1;
    }
}
