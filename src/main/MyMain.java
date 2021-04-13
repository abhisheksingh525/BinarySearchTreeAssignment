package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(50);
        tree.insert(10);
        tree.insert(65);
        tree.insert(20);
        tree.insert(53);
        tree.insert(42);
        tree.inOrder(tree.getRoot());
        tree.insert(35);
        tree.inOrder(tree.getRoot());
        System.out.println(tree.search(20));
        System.out.println(tree.search(52));
        // and perform insert, search, traversal, delete
    }
}
