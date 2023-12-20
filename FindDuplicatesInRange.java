package com.company;

public class FindDuplicatesInRange {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2};
        int ans = findDuplicate1(arr);
        System.out.println(ans);
    }
    static int findDuplicate1(int [] nums){
        int i = 0;

        while (i < nums.length){
            if (nums[i] != i + 1 && nums[i] == nums[nums[i] - 1]){
                return nums[i];
            }else if (nums[i] != i + 1){
                swap(nums, i, nums[i] - 1);
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int findDuplicate2(int [] nums){
        int [] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            if (temp[nums[i] - 1] == 1){
                return nums[i];
            }else{
                temp[nums[i] - 1] = 1;
            }
        }
        return -1;
    }
}
