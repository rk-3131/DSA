package com.company;
import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        TreeImplementation t = new TreeImplementation();
//        t.populate(s);
//        t.display();

        BinarySearchTree b = new BinarySearchTree();
        b.populate(s);
        b.display();
    }
}
