package com.company;

public class Main {

    public static void main(String[] args) {
//        SingleLinkedList1 l = new SingleLinkedList1();
//        System.out.println("Insert First");
//        l.insertFirst(1);
//        l.insertFirst(2);
//        l.insertFirst(3);
//        l.insertFirst(4);
//        l.insertFirst(5);
//        l.insertFirst(6);
//        l.getSize();
//        l.display();
//        System.out.println("Insert Last");
//        l.insertLast(1);
//        l.insertLast(2);
//        l.insertLast(3);
//        l.insertLast(4);
//        l.insertLast(5);
//        l.insertLast(6);
//        l.getSize();
//        l.display();
//        System.out.println("Delete at index");
//        l.deleteAtIndex(2);
//        l.getSize();
//        l.display();
//        l.deleteAtIndex(4);
//        l.deleteAtIndex(4);
//        l.display();
//        System.out.println("Delete First");
//        l.deleteFirst();
//        l.getSize();
//        l.display();
//        l.deleteFirst();
//        l.display();
//        System.out.println("Delete Last");
//        l.deleteLast();
//        l.display();
//        l.deleteLast();
//        l.display();
//        l.getSize();
//        System.out.println("Insert at index");
//        l.insertAtIndex(2, 10);
//        l.display();
//        l.getSize();

//        DoublyLinkedList dl = new DoublyLinkedList();
//        dl.addFirst(5);
//        dl.addFirst(4);
//        dl.addFirst(3);
//        dl.addFirst(2);
//        dl.addFirst(1);
//        dl.display();
//        dl.addLast(1);
//        dl.addLast(2);
//        dl.addLast(3);
//        dl.addLast(4);
//        dl.addLast(5);
//        dl.display();
//        dl.addAtIndex(2, 10);
//        dl.display();
//        dl.addAtIndex(4, 44);
//        dl.display();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.display();
//        dl.removeLast();
//        dl.removeLast();
//        dl.removeLast();
//        dl.removeLast();
//        dl.removeLast();
//        dl.display();

        LinkedListFromArray la = new LinkedListFromArray();
        int [] arr = {1,2,3,4,5,6,7,8,9};
        LinkedListFromArray.Node head = la.getList(arr);
        la.display();

    }
}
