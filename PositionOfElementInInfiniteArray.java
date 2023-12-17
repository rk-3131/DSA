package com.company;

public class PositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int [] arr = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81,
                80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61,
                60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41,
                40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21,
                20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        };
//        int[] arr = {3, 5, 7, 9, 10, 90,
//                100, 130, 140, 160, 170};
        ArraysPractice1 ap = new ArraysPractice1();
        ap.nonStaticReverseArray(arr);
        System.out.println(getSolution(arr, 100));
    }
    static int getSolution(int [] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;

            end = end + (end - start + 1) * 2;
//            as end index will be at the end of the new box
//            The size of the box has to be double every time
            start = newStart;
            if (end > arr.length - 1){
                end = arr.length - 1;
                break;
            }
        }

        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int [] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }

        return -1;
    }
}
