package com.company;

public class QueueMain{
    public static void main(String[] args) throws Exception {
//        CustomQueue c = new CustomQueue(5);
//        c.isEmpty();
//        c.isFull();
//        c.enqueu(1);
//        c.enqueu(2);
//        c.enqueu(3);
//        c.enqueu(4);
//        c.display();
//        System.out.println(c.isFull());
//        c.enqueu(5);
//        System.out.println(c.isFull());
////        c.enqueu(5);
//        System.out.println(c.dequeu());
//        c.display();
//        System.out.println(c.dequeu());
//        c.display();
//        System.out.println(c.dequeu());
//        c.display();
//        System.out.println(c.dequeu());
//        c.display();

        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.display();
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        cq.add(6);
        cq.add(7);
        cq.display();
    }
}
