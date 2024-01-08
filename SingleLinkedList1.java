package com.company;

// As we are making the linked list it will be a parent class
// Inside the linked list we can add the node which will have properties like val and next node
// Every linked list will have another value like it will have the values like head node and tail node and also a integer value which will tell that the size of the linked list will be 0 at start and it will keep on increasing as the time goes by
//

public class SingleLinkedList1 {
    Node head;
    Node tail;
    int size;
    SingleLinkedList1(){
        size = 0;
    }

    public void deleteLast(){
        if (tail == null){
            return;
        }

        Node temp = head;

        while (temp.next != tail){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
        return;
    }

    public void deleteFirst(){
        if (head == null){
            return;
        }

        head = head.next;
        size--;
        return;
    }
    public void getSize(){
        System.out.println(size);
    }
    public void deleteAtIndex(int index){
        Node temp = head;
        int i = 0;

        while (i < index - 1){
            temp = temp.next;
            i++;
        }

        if (temp != null){
            temp.next = temp.next.next;
        }
        size--;
        return;
    }

    public void insertAtIndex(int index, int val){
        int i = 0;
        Node temp = head;

        while (i < index - 1){
            temp = temp.next;
            i++;
        }

        Node node = new Node(val);
        Node newNext = temp.next;
        temp.next = node;
        node.next = newNext;
        size++;
        return;
    }

    public void insertLast(int val){
//        Create the node in the first hand
        Node node = new Node(val);

//        if head is null that means the linked list is empty
//        Hence both the head and tail will be pointing to same node
        if (head == null){
            head = tail = node;
            size++;
            return;
        }
//        if head is not null that means the linked list is not empty
//        Hence we can add the elements at the end of the linked list
//        Tail's next element will be the node that has added
        tail.next = node;
//        At last tail node will be updated as per the new node updated
        tail = node;
        size++;
        return;

    }
    public void insertFirst(int val){
//        In the first step create the node such that we will have it in the first place created
        Node node = new Node(val);
//        Then as we are adding the node at the start of the linked list we can point the next of the node to the node where head is pointing
        node.next = head;
//       As this node is added at the start of the linked list hence head will be this node only hence head = node
        head = node;

//        This will be done at the first node only as linked list will be empty and the tail node will be null
//        Only at the first node it will be made as that node
//        Otherwise this will be that tail as long as we are adding elements at the start of the node
        if (tail == null){
            tail = node;
        }
        size++;
        return;
    }

    public void display(){
//        temp is the variable of type Node which will be used to iterate over until we reach end of the linked list
        Node temp = head;

        while (temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    class Node{
        int val;
        Node next;

        Node (int val){
            this.val = val;
        }

        Node(int val, Node node){
            this.next = node;
            this.val = val;
        }
    }
}
