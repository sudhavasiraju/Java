package com.sample.graphs;

/**
 * Created by sudhakar.vasiraju on 4/10/16.
 */
public class FindIsBalanced {

    public int getHight(BinaryTreeNode root) {
        if (root == null) return 0;
        return Math.max(getHight(root.leftChild()), getHight(root.rightChild()) ) + 1;
    }

    public boolean isBalanced(BinaryTreeNode root) { // O(n log n)
        if (root == null) return true;

        int hightDiff = getHight(root.leftChild()) - getHight(root.rightChild());

        if (Math.abs(hightDiff) > 1) {
            return false;
        }else{
            return isBalanced(root.leftChild()) && isBalanced(root.rightChild());
        }
    }

    public int getHight2(BinaryTreeNode root) {
        if (root == null) return 0;

        int leftHight = getHight2(root.leftChild());
        if (leftHight == -1 ) {
            return -1;
        }

        int rightHight = getHight2(root.rightChild());
        if (rightHight == -1) {
            return -1;
        }

        int hightDiff = leftHight - rightHight;

        if (Math.abs(hightDiff) > 1) {
            return -1;
        }else{
            return Math.max(leftHight, rightHight) + 1;
        }

    }

    public boolean isBalanced2 (BinaryTreeNode root) { // O(n)
        if (getHight2(root) == -1) {
            return false;
        }else{
            return true;
        }
    }



    public static void main(String[] args) {
        FindIsBalanced fib = new FindIsBalanced();

//        BinaryTreeNode root = new BinaryTreeNode(1);
//        BinaryTreeNode node2 = new BinaryTreeNode(2);
//        BinaryTreeNode node3 = new BinaryTreeNode(3);
//        BinaryTreeNode node4 = new BinaryTreeNode(4);
//        BinaryTreeNode node5 = new BinaryTreeNode(5);
//        BinaryTreeNode node6 = new BinaryTreeNode(6);
//        BinaryTreeNode node7 = new BinaryTreeNode(7);
//        BinaryTreeNode node8 = new BinaryTreeNode(8);
//        BinaryTreeNode node9 = new BinaryTreeNode(9);
//        BinaryTreeNode node10 = new BinaryTreeNode(10);
//        BinaryTreeNode node11 = new BinaryTreeNode(11);
//        BinaryTreeNode node12 = new BinaryTreeNode(12);
//        BinaryTreeNode node13 = new BinaryTreeNode(13);
//        BinaryTreeNode node14 = new BinaryTreeNode(14);



    }

    public void sop(Object o) {
        System.out.println(o);
    }
}
