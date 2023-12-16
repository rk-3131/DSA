package com.company;

public class HouseRobber {
    public static void main(String[] args) {
//        This is the classic problem of dynamic programming problem statement of the problem is given below and link of the problem too
//        https://leetcode.com/problems/house-robber/description/

//        we have to find the maximum robbery that we can make such that no two adjacent houses can be robbed as they will give the signal and we can get caught
//        The input array will have the money in each of the house given in it


    }
    static int solution(int [] money){
//        if the array size is zero or one then you can guess the output

        if (money.length == 0){
            return 0;
        }else if (money.length == 1){
            return money[1];
        }

        int [] dp = new int[money.length];

        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);

        for (int i = 2; i < money.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + money[i]);
        }
        return dp[dp.length - 1];
    }
}
