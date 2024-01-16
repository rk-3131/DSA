package com.company;

public class CustomQueue {
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    int [] arr;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        arr = new int[size];
    }

    public boolean isFull(){
        return ptr == arr.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean enqueu(int number) throws Exception {
        if (isFull()){
            throw new Exception("Queue is already full");
        }
        ptr++;
        arr[ptr] = number;
        return true;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i <= ptr; i++){
            System.out.print(arr[i] + "-->");
        }
        System.out.println();
    }

    public int dequeu() throws Exception{
        if (isEmpty()){
            throw new Exception("Array is Already Empty");
        }

        int number = arr[0];

        for (int i = 0; i < ptr && i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        if (arr[arr.length - 1] != 0){
            arr[arr.length - 1] = 0;
        }
        return number;
    }
}
