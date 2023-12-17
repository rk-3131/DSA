package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestGreaterThanTarget {
    public static void main(String[] args) {
//        https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
        char [] letters = {'e','e','g','g'};
        char target = 'g';
        char solution = solution(letters, target);
        System.out.println(solution);
    }

    static char solution(char letters [], char target){
        Set<Character> set = new HashSet();
        for (int i = 0; i < letters.length; i++){
            set.add(letters[i]);
        }

        char [] letters2 = new char[set.size()];

        int i = 0;
        for (char element : set) {
            char ch = element;
            letters2[i] = ch;
            i++;
        }

        Arrays.sort(letters2);

        int start = 0;
        int end = letters2.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (letters2[mid] == target){
                if (mid == letters2.length - 1){
                    return letters2[0];
                }
                return letters2[mid + 1];
            }else if (letters2[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        if (start == letters2.length){
            return letters2[0];
        }

        return letters2[start];
    }
}
