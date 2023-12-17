package com.company;

public class StartPositionInSortedArray {
    public static void main(String[] args) {
//        This is the subproblem of a larger problem where we have to find the starting position of the array element
        int [] arr = {5,7,7,8,8,10};
        int target = 7;
        int ans = findStart(arr, target);
        int ans2 = startPosition(arr, target);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int startPosition(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
//                we have found the potential answer
                ans = mid;
//                as we have to find the first position hence we have to get in the reverse order
                end = mid - 1;
            }else if (nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    static int findStart(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid;
            }

            if (start == end && nums[start] == target){
                return start;
            }

            if (start == end && nums[start] != target){
                return -1;
            }
        }
        return -1;
    }
}
