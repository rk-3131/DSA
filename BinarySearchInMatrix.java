package com.company;

public class BinarySearchInMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(bSearch(arr, 55));
    }
    static boolean bSearch(int [][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0){
            if (arr[row][col] == target){
                return true;
            }else if (arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
