package com.company;

import java.util.HashMap;
import java.util.Map;

public class SortAccToFrequency {
    public static void main(String[] args) {
        String s = "abaccadeeefaafcc";
        System.out.println(frequencySort(s));
    }
    static public String frequencySort(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), getOrDefault(map, s.charAt(i)) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : map.keySet()){
            int num = map.get(ch);

            if (num < min){
                min = num;
                for (int i = 0; i < min; i++){
                    sb.append(ch);
                }
            }else if (num > max){
                max = num;
                for (int i = 0; i < max; i++){
                    sb.insert(0, ch);
                }
            }
        }

        return sb.toString();
    }
    static int getOrDefault(Map<Character, Integer> map, char ch){
        if (map.containsKey(ch)){
            return map.get(ch);
        }
        return 0;
    }
}
