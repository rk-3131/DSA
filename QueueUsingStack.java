package com.company;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public QueueUsingStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        while (s1.size() != 1){
            s2.add(s1.pop());
        }
        int number =  s1.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return number;
    }

    public int peek() {
        while (s1.size() != 1){
            s2.add(s1.pop());
        }
        int number = s1.peek();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return number;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
