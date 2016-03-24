package com.sample.linkedList;

/**
 * Created by sudhakar.vasiraju on 3/22/16.
 */
public class Node {
    private int data;
    private Node next = null;

    public Node(int data) {
        this.data = data;
    }

    public Node getNext(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    public void insertNodeAtEnd(Node node){
        Node current = this;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.next = node;
    }

    public void insertNodeAtEnd(int data){
        Node lastOne = new Node(data);
        Node current = this;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.next = lastOne;
    }
}
