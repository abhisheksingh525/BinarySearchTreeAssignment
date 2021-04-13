package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private Node root;
    private int size;

    public MyBinarySearchTree() {
        root = null;
        size = 0;
    }

    public Node getRoot(){
        return root;
    }
    @Override
    public void insert(E data) {
    }

    @Override
    public boolean search(E searchElement) {
        Node<E> temp = root;
        boolean response = false;
        while (temp != null) {
            if (searchElement.compareTo(temp.getData()) < 0) {
                temp = temp.getLeft();
            } else if (searchElement.compareTo(temp.getData()) > 0) {
                temp = temp.getRight();
            } else {
                response = true;
                break;
            }
        }

        return false;

    }

    @Override
    public void inOrder(Node<E> node) {

    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
