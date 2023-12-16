package com.company;

public class FindInsertPosition {
    public static void main(String[] args) {
//        https://leetcode.com/problems/search-insert-position/

        /*
        Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
        You must write an algorithm with O(log n) runtime complexity.
         */
        int [] arr = {1,3,5,6};
        int target = 2;
        System.out.println(solution(arr, target));
    }

    static int solution(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start  <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
