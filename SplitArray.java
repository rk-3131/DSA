package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SplitArray {
    public static void main(String[] args) {
//        int [] arr = {1,1,2,2,3,4};
        int [] arr = {1,1,1,1};
        System.out.println(isPossible(arr));
    }
    /*
    You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:

nums1.length == nums2.length == nums.length / 2.
nums1 should contain distinct elements.
nums2 should also contain distinct elements.
Return true if it is possible to split the array, and false otherwise.
     */

    static boolean isPossible(int [] arr){
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++){
            set.add(arr[i]);
            map.put(arr[i], getOrDefault(map, arr[i]) + 1);
        }

        int length = arr.length;
        int index = 0;
        int count = 0;

        while (hasValues(map)){
            count++;
            for (int k : map.keySet()){
                int value = map.get(k);
                index++;
                if (value > 2){
                    return false;
                }
                map.put(k, getOrDefault(map, value) - 1);
                if (index == length / 2){
                    break;
                }
            }
            if (count == 2){
                if (hasValues(map)){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean hasValues(Map<Integer, Integer> map){
        int count = 0;
        for (int k : map.keySet()){
            if (map.get(k) < 1){
                count++;
            }
        }

        if (count == map.size()){
            return false;
        }
        return true;
    }
    static int getOrDefault(Map<Integer, Integer> map, int number){
        if (map.containsKey(number)){
            return map.get(number);
        }
        return 0;
    }
}
