package com.company;

import java.util.HashMap;
import java.util.Map;

public class MinOperationsToMakeArrayEmpty {
    public static void main(String[] args) {
        int [] arr = {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        System.out.println(minOperations(arr));

    }
    static public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], getOrDefault(map, nums[i]) + 1);
        }

        for (int key : map.keySet()){
            if (map.get(key) % 3 == 0){
                ans += (map.get(key) / 3);
            }else{
                int val = map.get(key);
                if (val == 1){
                    return -1;
                }
                while (val % 3 != 0 || (map.get(key) - val) % 2 != 0){
                    if (val == 0){
                        break;
                    }
                    val--;
                }
                if (val == 1){
                    return -1;
                }
                ans = (ans + (val / 3));
                ans = (ans + (map.get(key) - val) / 2);
            }
        }

        return ans;
    }
    static int getOrDefault(Map<Integer, Integer> map, int key){
        if (map.containsKey(key)){
            return map.get(key);
        }

        return 0;
    }
}
