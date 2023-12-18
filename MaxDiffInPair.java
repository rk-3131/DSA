package com.company;

import java.util.Arrays;

public class MaxDiffInPair {
    public static void main(String[] args) {
        int [] nums = {5,6,2,7,4};
        int ans = maxProductDifference(nums);
//reme
        System.out.println(ans);
    }
    static public int maxProductDifference(int[] nums) {
//        int l1 = findMax(nums); // 7
//        int l2 = findSecondMax(nums, l1);
//
//        int s1 = findSmall(nums);
//        int s2 = findSecondSmall(nums, s1);
//
//        return l1 * l2 - s1 * s2;

//        Instead of doing all the stuff just sort the array and then get the elements as we want

        Arrays.sort(nums);

        int p1 = nums[nums.length - 1] * nums[nums.length - 2];

        int p2 = nums[0] * nums[1];

        return p1 - p2;
    }
    static int findSecondSmall(int [] nums, int small){
        int diff = nums[0] - small;
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i] != small && nums[i] - small < diff){
                diff = nums[i] - small;
                ans = nums[i];
            }
        }

        return ans;
    }
    static int findSmall(int [] nums){
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            ans = Math.min(ans, nums[i]);
        }

        return ans;
    }
    static int findSecondMax(int [] nums, int large){
        int diff = large - nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i] != large && large - nums[i] < diff){
                diff = large - nums[i];
                ans = nums[i];
            }
        }

        return ans;
    }
    static int findMax(int [] nums){
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            ans = Math.max(ans, nums[i]);
        }

        return ans;
    }
}
