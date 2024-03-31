package com.company;

import java.util.Arrays;

public class NQTArray {
    public static void main(String[] args) {
        int [] arr = {9,4,5,6,3,1,7,5,60};
//        System.out.println(minNumber(arr));
//        System.out.println(maxNumber(arr));

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(secondSmallestSecondLargest(arr)));
        System.out.println(Arrays.toString(secondSmallestSecondLargest2(arr)));
    }
    static int [] secondSmallestSecondLargest2(int [] arr){
        int [] ans = new int[2];

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (minNumber > arr[i]){
                minNumber = arr[i];
                minIndex = i;
            }
        }

//        int secondSmallest = 0;
//        int secondLargest = 0;
        int minDifference = Integer.MAX_VALUE;
        int maxDifference = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (i != maxIndex){
                minDifference = Math.min(minDifference, maxNumber - arr[i]);
            }

            if (i != minIndex){
                maxDifference = Math.max(maxDifference, maxNumber - arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (i != maxIndex){
                if (maxNumber - arr[i] == minDifference){
                    ans[1] = arr[i];
                }
            }

            if (i != minIndex){
                if (maxNumber - arr[i] == maxDifference){
                    ans[0] = arr[i];
                }
            }
        }

        return ans;
    }
    static int [] secondSmallestSecondLargest(int [] arr){
        int [] ans = new int[2];
        Arrays.sort(arr);

        ans[0] = arr[1];
        ans[1] = arr[arr.length - 2];

        return ans;
    }
    static int maxNumber(int [] arr){
        int ans = Integer.MIN_VALUE;

        for (int n : arr){
            if (n > ans){
                ans = n;
            }
        }
        return ans;
    }
    static int minNumber(int [] arr){
        int ans = Integer.MAX_VALUE;

        for (int n : arr){
            if (n < ans){
                ans = n;
            }
        }
        return ans;
    }
}
