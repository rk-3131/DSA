package com.company;

import java.util.*;

public class NQTArray {
    public static void main(String[] args) {
//        int[] arr = {9, 4, 5, 6, 3, 1, 7, 5, 60, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 100, 60};
//        int [] arr = {5,3,2,1,4};
//        System.out.println(minNumber(arr));
//        System.out.println(maxNumber(arr));

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(secondSmallestSecondLargest(arr)));
//        System.out.println(Arrays.toString(secondSmallestSecondLargest2(arr)));
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));

//        Map<Integer, Integer> map = countFreq(arr);
//
//        for (int k : map.keySet()){
//            System.out.println(k + " -->> " + map.get(k));

//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//        selectionSort2(arr);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(sumOfElements(arr));
//        rotateByGivenValue(arr, 3);
//        System.out.println(Arrays.toString(arr));

        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        rotateByGivenValue(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateByGivenValue(int [] arr, int k){
//        1 2 3 4 5 6 7 8 9

        int [] temp = new int[arr.length];
        int index = k;

        for (int i = 0; i < arr.length - k; i++){
            temp[index] = arr[i];
            index++;
        }

        index = 0;
        for (int i = arr.length - k; i < arr.length; i++){
            temp[index] = arr[i];
            index++;
        }

        for (int i = 0; i < temp.length; i++){
            arr[i] = temp[i];
        }

    }

    static int sumOfElements(int [] arr){
        int ans = 0;

        for (int i = 0; i < arr.length; i++){
            ans += arr[i];
        }

        return ans;
    }

    static void selectionSort2(int [] arr){
        for (int i = 0; i < arr.length; i++){
            int j = 0;
            int minNumber = Integer.MAX_VALUE;
            int minIndex = j;

            while (j < arr.length - i){
                if (arr[j] < minNumber){
                    minNumber = arr[j];
                    minIndex = j;
                }
                j++;
            }
            swap(arr, minIndex, j - 1);
        }
    }

    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++){
            int maxNumber = Integer.MIN_VALUE;
            int maxIndex = i;
            int j = 0;
            while (j < arr.length - i){
                if (arr[j] > maxNumber){
                    maxNumber = arr[j];
                    maxIndex = j;
                }
                j++;
            }
            swap(arr, maxIndex, j - 1);
        }
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static Map<Integer, Integer> countFreq(int [] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])){
                int number = map.get(arr[i]);
                map.put(arr[i], number + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        return map;
    }

    static void reverseArray(int [] arr){
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
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
