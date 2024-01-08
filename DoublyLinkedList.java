package com.company;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    void addFirst(int val){
        Node node = new Node(val);

        if (head == null){
            head = tail = node;
            return;
        }
//        Node temp = head;
        node.next = head;
        head.prev = node;
        head = node;
    }
    void removeFirst(){
        if (head == null){
            return;
        }
        head = head.next;
    }
    void removeLast(){
        if (tail == null){
            return;
        }

        tail = tail.prev;
    }
    void addLast(int val){
        Node node = new Node(val);
        if (tail == null){
            head = tail = node;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    void addAtIndex(int index, int val){
        int i = 0;
        Node temp = head;

        while (i < index - 1){
            i++;
            temp = temp.next;
        }
        Node node = new Node(val);
        Node newNext = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next = newNext;
        newNext.prev = node;
    }
    void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.val + "<--->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }
}
