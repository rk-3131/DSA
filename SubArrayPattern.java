package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubArrayPattern {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(getList(arr));
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        List<Integer> list = new ArrayList<Integer>();
        generateSubArrays(arr, 0, new ArrayList<Integer>(), ans);

        System.out.println(ans);
    }

    static void generateSubArrays(int [] arr, int index, List<Integer> current, List<List<Integer>> ans){
//        Base condition will be used to check if the index of the array is at the end of the array
//        if it is at the end of the array then it will check of the current list is empty or not
//        if the current list is not empty then we will have the answer of one of the subarray found

        if (index == arr.length){
            if (!current.isEmpty()){
                ans.add(new ArrayList<Integer>(current));
            }
            return;
        }

//        Here we will have two choices we can either add the element or can even skip that element
//        And hence these will be the two choices and two main conditions that can be printed and chosen from

//        This is the condition which will be used for the purpose of setting and adding the current element in the list
        current.add(arr[index]);
        generateSubArrays(arr, index + 1, current, ans);

//        Now this is the condition we will see if we can skip the elements from the list
        current.remove(current.size() - 1);
        generateSubArrays(arr, index + 1, current, ans);


    }
    static List<List<Integer>> getList(int [] arr){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                List<Integer> temp = new ArrayList<Integer>();
                for (int k = i; k <= j; k++){
                    temp.add(arr[k]);
                }
                ans.add(temp);
            }
        }

        return ans;
    }
}
