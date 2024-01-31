package com.company;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemprature {
    public static void main(String[] args) {
        int [] arr = {30,60,90};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    static public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int [] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--){
            if (stack.isEmpty()){
                stack.push(i);
                ans[i] = 0;
                continue;
            }
            if (arr[stack.peek()] < arr[i]){
                while (!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    ans[i] = 0;
                    stack.push(i);
                }else{
                    ans[i] = stack.peek() - i;
                    stack.push(i);
                }
            }else{
                ans[i] = stack.peek() - i;
                stack.push(i);
            }
        }
        return ans;
    }
}
