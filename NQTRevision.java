package com.company;

public class NQTRevision {
    public static void main(String[] args) {
        int [] nums = {9,4,3,2};
        System.out.println(maximumDifference(nums));
    }

    static int maximumDifference(int [] nums){
//        https://leetcode.com/problems/maximum-difference-between-increasing-elements/submissions/1234496517/

        int minNumber = nums[0];
        int maxDifference = -1;

        for (int i = 1; i < nums.length; i++){
            minNumber = Math.min(nums[i], minNumber);

            maxDifference = Math.max(maxDifference, nums[i] - minNumber);
        }

        if (maxDifference == 0){
            return -1;
        }

        return maxDifference;
    }
    static int largestSubArraySum(int [] arr){
//        Given an array return the sum of sub array which is largest
        int currentSum = arr[0];
        int globalSum = arr[0];

        for (int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            globalSum = Math.max(globalSum, currentSum);
        }

        return globalSum;
        /*
        This problem can be solved by using the kadane's algorithm
        Here to find the largest sum of the subbaray we have to go through the array
        initially first element has to be taken as gloablmax and localmax and then
        localmax will be maximum of number at that index and sum of localmax + number at that index
        and at the end global sum will be max of localmax and global max
         */
    }

    static int maxProfit(int[] prices) {
//        https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

        int minNumber = prices[0];
        int maxProfit = 0;


        for (int i = 1; i < prices.length; i++){
            minNumber = Math.min(prices[i], minNumber);

            maxProfit = Math.max(maxProfit, prices[i] - minNumber);
        }

        return maxProfit;

        /*
        Here logic is simple
        First we will keep finding the smallest number in the array
        After finding the smallest number maxProfit will be found as max of maxProfit and nums[i] - minNumber
        */
    }
}
