package com.company;

public class LinkedListFromArray {
    Node head;
    Node tail;
    int size;

    public Node getList(int [] arr){
        Node node = new Node();
        Node temp = node;
        int i = 0;

        while (i < arr.length){
            temp.next = new Node(arr[i]);
            i++;
            temp = temp.next;
            size++;
        }

        head = node.next;

        return head;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.val +"-->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    class Node{
        int val;
        Node next;

        Node (){

        }
        Node(int val){
            this.val = val;
        }
    }
}
