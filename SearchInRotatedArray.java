package com.company;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {5,1,3};
        int target = 5;

        int ans = search(arr, target);

        System.out.println(ans);
    }
    static public int search(int[] nums, int target) {
        // we know how to find the peak index in the array
        // hence we will get the peak index and then we can use it to find the partition and hence we can find the target element in the array on either side of the peak element

//        int peak = findPeak(nums);
//        finding the peak element in the mountain array and finding it in the regular array is different job hence this peak will never work here
        // Now we have the peak element in the array we can do the binary search on both the half of the array

        int pivot = findPivot(nums);
        int ans1 = bSearch(nums, target, 0, pivot);

        if (ans1 != -1){
            return ans1;
        }

        return bSearch(nums, target, pivot + 1, nums.length - 1);
    }
    static int bSearch(int [] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
//    4 5 1 2 3
    static int findPivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (nums[mid] <= nums[end]){
//                it means that the pivot is either that number itself or the number is other number which is to the left of that number
                end = mid;
            }else{
//                as the middle element is greater than that of the number in the end then we can conclude that answer lies in the right part of the array
                start = mid + 1;
            }
        }
        return start;
    }
    static int findPeak(int [] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
