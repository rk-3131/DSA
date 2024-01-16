package com.company;


import java.util.Scanner;

public class TreeImplementation {
    TreeImplementation(){

    }
    private Node root;
    class Node {
        int val;
        Node left;
        Node right;

        Node (int val){
            this.val = val;
        }

    }

    public void populate(Scanner s){
        System.out.print("Enter the values of the root Node: ");
        int val = s.nextInt();
        root = new Node(val);
        populate(s, root);
    }
    private void populate(Scanner s, Node node){
        System.out.print("Do you want to enter left to the Node: " + node.val + ": ");
        boolean left = s.nextBoolean();
        if (left){
            System.out.print("Enter the value to the left of " + node.val + ": ");
            int val = s.nextInt();
            node.left = new Node(val);
            populate(s, node.left);
        }

        System.out.print("Do you want to enter right to the Node: " + node.val + ": ");
        boolean right = s.nextBoolean();
        if (right){
            System.out.print("Enter the value to the right of " + node.val + ": ");
            int val = s.nextInt();
            node.right = new Node(val);
            populate(s, node.right);
        }
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
