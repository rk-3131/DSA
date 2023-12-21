package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WidestVerticalArea {
    public static void main(String[] args) {
        int [][] arr = {
                {3,1},{9,0},{1,0},{1,4},{5,3},{8,8}
        };

        System.out.println(findArea(arr));
    }
    static int findArea(int [][] arr){

        int ans = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++){
            list.add(arr[i][0]);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i + 1) - list.get(i) > ans){
                ans = list.get(i + 1) - list.get(i);
            }
        }

        return ans;
    }
}
