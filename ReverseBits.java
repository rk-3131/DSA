package com.company;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(12));
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
