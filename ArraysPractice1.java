package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Hello World");

//        to declare the array in the java we have syntax which has to be followed
//        datatype [] array_name = new datatype[size];
//        where the part at the left of the equal to sign is done at the compile time
//        variable will be created in the stack memory
//        and the part that is at the right of that sign will be executed at the runtime
//        variable created in the stack memory will now be pointing to the object created in the heap memory

//        int [] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

//        System.out.println("Print the array using the for loop(simple)");
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("Print the array using for each loop");
//        for (int n : arr){
//            System.out.print(n + " ");
//        }
//        System.out.println();
//
//        System.out.println("Printing the array using toString in the java arrays");
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("Printing the array using the method that I created for the purpose of printing it");
//        System.out.println(printArray(arr));

//        2D array are the arrays that are same as the 1D array but just one major differnce is that they have more number of dimensions
//        i.e they are arranged in the form of rows and columns
//        Hence we can also visualize using the form of rows and columns

//        syntax
//        datatype [][] name_of_array= new datatype[size(mendatory)][size(not mendatory)]
//        number of rows inside the array has to be specified but specifying the number of columns is not necessary while initializing the arrray

        int [][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//        This is for taking the input in the array
//        for (int i = 0; i < arr2D.length; i++){
//            for (int j = 0; j < arr2D[i].length; j++){
//                arr2D[i][j] = s.nextInt();
//            }
//        }

//        for (int i = 0; i < arr2D.length; i++){
//            for (int j = 0; j < arr2D[i].length; j++){
//                System.out.print(arr2D[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(print2DArray(arr2D));

//        System.out.println();

//        Swapping the elements in the array
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

//        swap(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

//        maximum value of the array
//        System.out.println(maxValue(arr));

//        reversing the array
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    void nonStaticReverseArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void reverseArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static int maxValue(int [] arr){
        int ans = Integer.MIN_VALUE;

        for (int n : arr){
            ans = Math.max(ans, n);
        }
        return ans;
    }
    static String print2DArray(int [][] arr2D){
        if (arr2D == null){
            return "Empty Array";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < arr2D.length; i++){
            int [] temp = arr2D[i];
            sb.append(printArray(temp));
            if (i == arr2D.length - 1){
                sb.append("\n]");
                return sb.toString();
            }
            sb.append(",\n");
        }
        return sb.toString();
    }
    static String printArray(int [] arr){
//        create the method which will work same as that of the toString in java arrays
        if (arr == null || arr.length == 0){
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (i < arr.length){
            sb.append(arr[i]);
            if (i == arr.length - 1){
                sb.append("]");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
        return sb.toString();
    }

    static void swap(int [] arr, int fisrt, int second){
        int temp = arr[fisrt];
        arr[fisrt] = arr[second];
        arr[second] = temp;
    }

}
