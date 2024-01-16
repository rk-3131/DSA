package com.company;

public class CircularQueue {
    private static final int DEFAULT_SIZE = 10;
    int [] arr;
    int start;
    int end;
    int size;

    CircularQueue(int size){
        arr = new int[size];
        start = 0;
        end = 0;
        size = 0;
    }

    CircularQueue(){
        this(DEFAULT_SIZE);
    }

    void display(){
        int i = start;

        do {
            System.out.print(arr[i] + "  ");
            i = ((i + 1) % arr.length);
        } while (i != end);
        System.out.println();
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == arr.length;
    }

    boolean add(int number){
        if (isFull()){
            System.out.println("The Queue is Full");
            return false;
        }

        arr[end] = number;
        end = (end + 1) % arr.length;
        size++;
        return true;
    }

    int remove(){
        if (isEmpty()){
            System.out.println("The Queue is already empty");
            return -1;
        }

        int number = arr[start];
        start = (start + 1 ) % arr.length;
        size--;
        return number;
    }
}
