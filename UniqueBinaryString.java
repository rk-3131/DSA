package com.company;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-unique-binary-string/description/

public class UniqueBinaryString {
    public static void main(String[] args) {
        String [] arr = {"01","10"};
        System.out.println(findDifferentBinaryString2(arr));
    }
    static public String findDifferentBinaryString2(String[] nums) {
        int [] temp = new int[(int) Math.pow(2, nums.length)];
//        List<Integer> list = new ArrayList<Integer>();

        for (String str : nums){
            int pow = 1;
            int number = 0;
            for (int i = str.length() - 1; i >= 0; i--){
                number += Character.getNumericValue(str.charAt(i)) * pow;
                pow *= 2;
            }
            temp[number] = 1;
        }

        int ansInteger = 0;
        for (int i = 1; i < temp.length; i++){
            if (temp[i] == 0){
                ansInteger = i;
                break;
            }
        }

        String str = Integer.toBinaryString(ansInteger);

        if (str.length() < nums.length){
            StringBuilder sb = new StringBuilder(str);
            while (sb.length() < nums.length){
                sb.insert(0, "0");
            }
            return sb.toString();
        }
        return str;
    }

    static public String findDifferentBinaryString1(String[] nums) {
        int [] temp = new int[(int) Math.pow(2, nums.length)];
        List<Integer> list = new ArrayList<Integer>();

        for (String str : nums){
            int pow = 1;
            int number = 0;
            for (int i = str.length() - 1; i >= 0; i--){
                number += Character.getNumericValue(str.charAt(i)) * pow;
                pow *= 2;
            }
            list.add(number);
        }

        while (list.size() != 0){
            int number = list.remove(list.size() - 1);
            temp[number] = 1;
        }

        int ansInteger = 0;
        for (int i = 1; i < temp.length; i++){
            if (temp[i] == 0){
                ansInteger = i;
            }
        }

        String str = Integer.toBinaryString(ansInteger);

        if (str.length() < nums.length){
            StringBuilder sb = new StringBuilder(str);
            while (sb.length() < nums.length){
                sb.insert(0, "0");
            }
            return sb.toString();
        }
        return str;
    }
}
