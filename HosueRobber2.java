package com.company;

public class HosueRobber2 {
    public static void main(String[] args) {
//        This problem is same as of the house robber I where main focus was to gain the maximum out of the roberry

//        https://leetcode.com/problems/house-robber-ii/description/

//        but here first house is adjacent to the last house hence it can not be used in the calculation simultaneuously
    }

    static int solution(int [] nums){
        if (nums.length == 0){
            return 0;
        }else if (nums.length == 1){
            return nums[0];
        }

        int exceptLast = helper(nums, 0, nums.length - 2);
        int exceptFirst = helper(nums, 1, nums.length - 1);

        return Math.max(exceptFirst, exceptLast);
    }

    static int helper(int [] nums, int start, int end){
        int prevSum = 0;
        int currSum = 0;

        for (int i = start; i<= end; i++){
            int temp = currSum;
            currSum = Math.max(currSum, nums[i] + prevSum);
            prevSum = temp;
        }
        return currSum;
    }
}
