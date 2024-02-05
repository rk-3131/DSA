package com.company;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

    }
    static public int firstUniqChar(String s) {
        int [] arr = new int[26];

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            arr[ch - 97]++;
        }

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (arr[ch - 97] == 1){
                return i;
            }
        }

        return -1;
    }
}
