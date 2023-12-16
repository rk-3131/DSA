package com.company;

import java.util.Scanner;


public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9};
//        int target = s.nextInt();
//        System.out.println(isPresent(arr, target));
//        int index = returnIndex(arr, target);
//
//        if (index == -1){
//            System.out.println("No element found");
//        }else{
//            System.out.println("Element" + target+ " at index "+ index+ " found");
//        }


//        Search in the string
//        String str = s.nextLine();
//        String targetString = s.nextLine();
//        char target = targetString.charAt(0);
//        System.out.println(charInString(str, target));

//        Search in particular range
//        System.out.print("Enter the start Index: ");
//        int start = s.nextInt();
//        System.out.print("Enter the end Index: ");
//        int end = s.nextInt();
//        System.out.print("Enter the target number: ");
//        int target = s.nextInt();
//        System.out.println(searchInRange(arr, start, end, target));

//        System.out.println(minimumNumber(arr));


//        int [][] arr2D = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.print("Enter the target element: ");
//        int target = s.nextInt();
//        System.out.println(searchIn2DArray(arr2D, target));

        int [] arr2 = {12,345,2,6,7896};
        System.out.println(numberWithEvenDigits(arr2));
    }

//    find number with even number of digits
    static int numberWithEvenDigits(int [] arr){
        int ans = 0;
        for (int n : arr){
            if (countDigits2(n) % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
//    We can get the number of digits from the log10 + 1 of the number
    static int countDigits2(int number){
        if (number < 0){
            number *= -1;
        }
        return (int) Math.log10(number) + 1;
    }
//    Below is the function which is used to get the number of digits in the given number
    static int countDigits(int number){
        int count = 0;

        while (number > 0){
            count++;
            number /= 10;
        }
        return count;
    }

    static boolean searchIn2DArray(int [][] arr, int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    static int minimumNumber(int [] arr){
        int ans = Integer.MAX_VALUE;

        for (int n : arr){
            ans = Math.min(ans, n);
        }
        return ans;
    }

    static boolean searchInRange(int [] arr, int start, int end, int target){
        while (start <= end){
            if (arr[start] == target || arr[end] == target){
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
    static boolean charInString(String str, char target){
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    static int returnIndex(int [] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static boolean isPresent(int [] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
