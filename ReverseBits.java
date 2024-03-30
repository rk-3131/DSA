package com.company;

import java.util.ArrayList;
import java.util.List;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(12));
        System.out.println(reverseBits2(12));
    }
    public static long reverseBits2(long n){
        String binaryNumber = Long.toBinaryString(n);

        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < binaryNumber.length(); i++){
            list.add(binaryNumber.charAt(i));
        }

        int i = 0;
        int j = list.size() - 1;

        while (i < j){
            char temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        int size = list.size();
        int limit = 32 - size;
        int index = 0;

        while (index < limit){
            list.add('0');
            index++;
        }

        long ans = 0;
        double power = 0;
        index = list.size() - 1;

        while (index >= 0){
            int digit = Character.getNumericValue(list.get(index));

            ans += (digit * (Math.pow(2, power)));
            index--;

        }

        return ans;
    }
    public static long reverseBits(long n) {
        // Write your code here

        if (n == 0){
            return 0;
        }
        String numberString = Long.toBinaryString(n);

        char [] arr = numberString.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // String newString = new String(arr);

        int index = arr.length - 1;
        double power = 0;
        long ans = 0;

        while (index >= 0){
            char ch = arr[index];

            int number = Character.getNumericValue(ch);

            ans += (number * (Math.pow(2, power)));
            power++;
            index--;
        }

        return ans;
    }
}
