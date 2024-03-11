package com.company;

import java.util.Scanner;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        bst.populate(s);
        bst.display();
    }

}
