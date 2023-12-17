package com.company;

public class EndPositionInSortedArray {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
        int ans = endPostion(arr, target);
        System.out.println(ans);
    }
    static int endPostion(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
//        5 7 7 8 8 10
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
//                here we have found the potential answer
                ans = mid;
                start = mid + 1;
            }else if (nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
