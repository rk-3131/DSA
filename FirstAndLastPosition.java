package com.company;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
        int [] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static public int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];

        ans[0] = findStart(nums, target);
        ans[1] = findEnd(nums, target);

        return ans;
    }
    static int findEnd(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
                // here we have found the potential answer
                ans = mid;
                // as we have to find the end postion of the number hence we will go further of the number than that in the reverse order
                start = mid + 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
    static int findStart(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
                // we have found the potential answer to the solution
                ans = mid;
                // as we have to find the first postion here hence we will go to the reverse side of the array
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
