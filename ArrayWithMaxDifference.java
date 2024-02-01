package com.company;

import java.util.Arrays;

public class ArrayWithMaxDifference {
    public static void main(String[] args) {
        int [] arr = {1,3,4,8,7,9,3,5,1};
        int [][] ans = divideArray(arr, 2);
        for (int [] a : ans){
            for (int e : a){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
    static   public int[][] divideArray(int[] nums, int k) {
        int len = nums.length;
        int[][] res = new int[len/3][3];
        Arrays.sort(nums);
        for(int i=0,m=0; i<len; i=i+3,m++){
            res[m][0] = nums[i];
            for(int j=1; j<3; j++){
                if(nums[i+j]-res[m][0]<=k){
                    res[m][j]=nums[i+j];
                } else{
                    return new int[0][0];
                }
            }
        }
        return res;
    }
}
