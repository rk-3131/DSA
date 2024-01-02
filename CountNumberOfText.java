package com.company;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfText {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(2,2);
        map.put(3,5);
        map.put(4,8);
        map.put(5,11);
        map.put(6,14);
        map.put(7,18);
        map.put(8,21);
        map.put(9,25);

        helper("", "22233", map);
    }
    public int countTexts(String pressedKeys) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(2,2);
        map.put(3,5);
        map.put(4,8);
        map.put(5,11);
        map.put(6,14);
        map.put(7,18);
        map.put(8,21);
        map.put(9,25);

        helper("", pressedKeys, map);
        return 1;
    }

    static void helper(String p, String up, Map<Integer, Integer> map){
//        22233
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int number = Character.getNumericValue(up.charAt(0));
        int index = 0;
        while (index < up.length() && up.charAt(index) == up.charAt(0)){
            index++;
        }

        int range;

        if (number == 7 || number == 9){
            range = 3;
        }else {
            range = 2;
        }

        int actualRange = Math.min(range, index - 1);

        int start = map.get(number) - range;
        int end = map.get(number) - (range - actualRange);


        for (int i = start; i <= end; i++){
            char ch = (char) (i + 'a');
            helper(p + ch, up.substring(1), map);
        }
    }
}
