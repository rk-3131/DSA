package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchTree {
    BinarySearchTree(){

    }

    class Node {
        int val;
        Node left;
        Node right;

        Node (int val){
            this.val = val;
        }
    }
    Node root;

    void populate(Scanner s){
        System.out.print("Enter number of values to be inserted: ");
        int number = s.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < number; i++){
            int n = s.nextInt();
            list.add(n);
        }

        for (int i = 0; i < number; i++){
            insert(list.get(i), root);
        }
    }
    Node insert(int value, Node node){
        if (node == null){
            node = new Node(value);
            return node;
        }

        if (node.val < value){
            node.left = insert(value, node.left);
        }

        if (node.val > value){
            node.right = insert(value, node.right);
        }

        return node;
    }
    public void display(){
        displayInOrder(root);
    }
    private void displayInOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        displayInOrder(root.left);
        displayInOrder(root.right);
    }
}
