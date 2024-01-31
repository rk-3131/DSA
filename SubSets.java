package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
    static public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        helper(nums, list, ans);
        return ans;
    }

    static private void helper(int[] nums, List<Integer> list, List<List<Integer>> ans) {
        if (nums.length == 0){
            ans.add(list);
            return;
        }

        helper(Arrays.copyOfRange(nums, 1, nums.length), list, ans);
        list.add(nums[0]);
        helper(Arrays.copyOfRange(nums, 1, nums.length), list, ans);
        return;
    }
}
