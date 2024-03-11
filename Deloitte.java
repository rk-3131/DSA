package com.company;
import  java.util.Scanner;

public class Deloitte {
    public static void main(String[] args) {
        System.out.println(getMinNumberHavingSetBits());
    }
    static int getMinNumberHavingSetBits(){
        Scanner s = new Scanner(System.in);
        int ans = 0;

        int n = s.nextInt();
        int k = s.nextInt();

        for (int i = 0; i < n; i++){
            String bitString = Integer.toBinaryString(i);
            int count = 0;

            for (int j = 0; j < bitString.length(); j++){
                if (bitString.charAt(j) == '1'){
                    count++;
                }
            }
            if (count >= k){
                ans++;
            }
        }
        return ans;
    }
}
