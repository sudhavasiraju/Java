package com.sample.graphs;

import java.util.*;

/**
 * Created by sudhakar.vasiraju on 3/28/16.
 */
public class DFS {

    public boolean find(TreeNode root, int search) {
        boolean found = false;
        Stack<TreeNode> stack = new Stack<>();
        if (root.data() == search) {
            found = true;
        }
        stack.push(root);
        root.setVisited(true);
        sop(root.data());

        TreeNode current;
        while (!stack.isEmpty()) {
            current = stack.peek();
            TreeNode node = current.getUnvisitedChildForDFS();
            if (node  != null) {
                sop(node.data());
                if (node.data() == search) {
                    found = true;
                    break;
                }
                node.setVisited(true);
                stack.push(node);
            }else{
                stack.pop();
            }

        }
        root.makeAllUnVisited();
        return  found;
    }

    public Map<Boolean, List<Integer>> findPath(TreeNode root, int search) {
        boolean found = false;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> path = new ArrayList<>();
        Map<Boolean, List<Integer>> returnMap = new HashMap<>();
        if (root.data() == search) {
            found = true;
        }
        stack.push(root);
        root.setVisited(true);
        path.add(root.data());

        TreeNode current;
        while (!stack.isEmpty()) {
            current = stack.peek();
            TreeNode node = current.getUnvisitedChildForDFS();
            if (node  != null) {
                path.add(node.data());
                if (node.data() == search) {
                    found = true;
                    break;
                }
                node.setVisited(true);
                stack.push(node);
            }else{
                stack.pop();
            }

        }
        root.makeAllUnVisited();
        returnMap.put(found, path);

        return returnMap;
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);
        TreeNode node12 = new TreeNode(12);
        TreeNode node13 = new TreeNode(13);
        TreeNode node14 = new TreeNode(14);
        root.addChild(node2);
        root.addChild(node3);
        root.addChild(node4);
        node2.addChild(node7);
        node2.addChild(node5);
        node3.addChild(node5);
        node3.addChild(node6);
        node3.addChild(node8);
        node4.addChild(node8);
        node7.addChild(node12);
        node5.addChild(node12);
        node5.addChild(node9);
        node6.addChild(node9);
        node6.addChild(node10);
        node6.addChild(node11);
        node8.addChild(node11);
        root.addChild(node13);

        dfs.sop("Is 5 exists? " + dfs.find(root, 5));
        dfs.sop("Is 13 exists? " + dfs.find(root, 14));
        dfs.sop("Is 11 exists? " + dfs.find(root, 11));
        dfs.sop("Is 13 exists? " + dfs.find(root, 13));
        dfs.sop(" ");

        dfs.sop("Is 5 exists? " + dfs.findPath(root, 5));
        dfs.sop("Is 13 exists? " + dfs.findPath(root, 14));
        dfs.sop("Is 11 exists? " + dfs.findPath(root, 11));
        dfs.sop("Is 13 exists? " + dfs.findPath(root, 13));

    }


    public void sop(Object o) {
        System.out.println(o);
    }
}
