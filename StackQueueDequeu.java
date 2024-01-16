package com.company;

import java.util.*;

public class StackQueueDequeu {
    public static void main(String[] args) {
//        Implementing the Stack

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

        Deque<Integer> dq = new ArrayDeque<Integer>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(5);
        dq.addLast(6);
        dq.addLast(7);

        while (!dq.isEmpty()){
            System.out.println(dq.removeFirst());
            System.out.println(dq.removeLast());
        }
    }
}
