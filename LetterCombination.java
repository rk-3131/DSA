package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public static void main(String[] args) {
//        https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
        System.out.println(letterCombinations("23"));
    }
    static public List<String> letterCombinations(String digits) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(2, 2);
        map.put(3, 5);
        map.put(4, 8);
        map.put(5, 11);
        map.put(6, 14);
        map.put(7, 18);
        map.put(8, 21);
        map.put(9, 25);

        return helper("", digits, map);
    }
    static List<String> helper(String p, String up, Map<Integer, Integer> map){
        if (up.isEmpty()){
            List<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        int number = Character.getNumericValue(up.charAt(0));

        int start;
        int end;

        if (number == 7 || number == 9){
            start = map.get(number) - 3;
            end = map.get(number);
        }else {
            start = map.get(number) - 2;
            end = map.get(number);
        }
        List<String> ans = new ArrayList<String>();

        for (int i = start; i <= end; i++){
            char ch = (char) ('a' + i);
            ans.addAll(helper(p + ch, up.substring(1), map));
        }

        return ans;
    }
}
