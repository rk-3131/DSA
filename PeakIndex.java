package com.company;

public class PeakIndex {

    public static void main(String[] args) {
        //    here we have been given the array which is mountain array
    //    i.e one part of the array is increasing and the other one is decreasing

        int[] arr = {5,1,3};
        int peakIndex = findPeak(arr);
        System.out.println(peakIndex);
    }

    static int findPeak(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
