package com.company;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,5};
        System.out.println(lSearchMultiple(arr, 2));
    }
    static List<Integer> lSearchMultiple(int [] arr, int target){
//        List<Integer> list = new ArrayList<Integer>();
//
//        helperMultiple(arr, target, 0, list);
//
//        return list;

        return helperMultiple(arr, target, 0);
    }

    static List<Integer> helperMultiple(int [] arr, int target, int index){
        List<Integer> list = new ArrayList<Integer>();

        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }
        List<Integer> fromNextCall = helperMultiple(arr, target, index + 1);

        list.addAll(fromNextCall);

        return list;
    }

    private static List<Integer> helperMultiple(int[] arr, int target, int index, List<Integer> list) {

        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        return helperMultiple(arr, target, index + 1, list);
    }

    static int lSearch(int [] arr, int target){
        return helper(arr, target, 0);
    }
    static int helper(int [] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return helper(arr, target, index + 1);
    }
}
