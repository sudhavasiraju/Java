package com.sample.graphs;

/**
 * Created by sudhakar.vasiraju on 4/10/16.
 */
public class BinaryTreeNode {

    private int data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int data(){
        return this.data;
    }

    public void addLeftChild(BinaryTreeNode btn) {
        this.leftChild = btn;
    }

    public void addRightChild (BinaryTreeNode btn) {
        this.rightChild = btn;
    }

    public BinaryTreeNode leftChild() {
        return this.leftChild;
    }

    public BinaryTreeNode rightChild() {
        return this.rightChild;
    }
}
