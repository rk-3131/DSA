package com.company;

public class CustomeStack {
    private static final int DEFAULT_SIZE = 10;
    int [] arr;
    int ptr;

    CustomeStack(){
        this(DEFAULT_SIZE);
    }
    CustomeStack(int size){
        arr = new int[size];
    }
    boolean isFull(){
        return ptr == arr.length;
    }
    boolean isEmpty(){
        return ptr == -1;
    }
    int getSize(){
        return ptr + 1;
    }
    int pop(){
        if (ptr == -1){
            System.out.println("Stack already empty");
            return -1;
        }

        int temp = arr[ptr];
        arr[ptr] = 0;
        ptr--;
        return temp;
    }
    boolean push(int number){
        if (ptr == arr.length - 1){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        arr[ptr] = number;
        return true;
    }
}
