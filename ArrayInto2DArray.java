package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayInto2DArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(arr));
    }
    static public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], getOrDefault(map, nums[i]) + 1);
        }

        List<List<Integer>> ans = new ArrayList();




        while (getCount(map)){
            List<Integer> row = new ArrayList();
            for (int key : map.keySet()){
                if (map.get(key) > 0){
                    row.add(key);
                    map.put(key, map.get(key) - 1);
                }
            }
            ans.add(row);
        }
        return ans;
    }
    static int getOrDefault(Map<Integer, Integer> map, int element){
        if (map.containsKey(element)){
            return map.get(element);
        }
        return 0;
    }
    static boolean getCount(Map<Integer, Integer> map){
        int count = 0;
        for (int key : map.keySet()){
            if (map.get(key) < 1){
                count++;
            }
        }

        if (count == map.size()){
            return false;
        }
        return true;
    }
}
