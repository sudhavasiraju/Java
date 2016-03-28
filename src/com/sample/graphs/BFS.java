package com.sample.graphs;

import java.util.*;

/**
 * Created by sudhakar.vasiraju on 3/27/16.
 */
public class BFS {

    public boolean find(TreeNode root, int search) {
        boolean found = false;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        root.setVisited(true);
        sop(root.data());
        if (root.data() == search) {
            found = true;
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            List<TreeNode> unvisitedChildren = node.getUnvisitedChildren();
            for (TreeNode node1:unvisitedChildren) {
                sop(node1.data());
                if (node1.data() == search) {
                    found = true;
                    break;
                }else{
                    node1.setVisited(true);
                    queue.add(node1);
                }
            }
            if (found) break;
        }
        root.makeAllUnVisited();
        return found;
    }

    public Map<Boolean, List<Integer>> findPath(TreeNode root, int search) {
        boolean found = false;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> path = new ArrayList<>();
        Map<Boolean, List<Integer>> returnMap = new HashMap<>();
        queue.add(root);
        root.setVisited(true);
        path.add(root.data());
        if (root.data() == search) {
            found = true;
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            List<TreeNode> unvisitedChildren = node.getUnvisitedChildren();
            for (TreeNode node1:unvisitedChildren) {
                path.add(node1.data());
                if (node1.data() == search) {
                    found = true;
                    break;
                }else{
                    node1.setVisited(true);
                    queue.add(node1);
                }
            }
            if (found) break;
        }
        root.makeAllUnVisited();
        returnMap.put(found, path);
        return returnMap;
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
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

        bfs.sop("Is 5 exists? " + bfs.find(root, 5));
        bfs.sop("Is 13 exists? " + bfs.find(root, 13));
        bfs.sop("Is 11 exists? " + bfs.find(root, 11));
        bfs.sop("Is 14 exists? " + bfs.find(root, 14));
        bfs.sop(" ");

        bfs.sop("Is 5 exists? " + bfs.findPath(root, 5));
        bfs.sop("Is 13 exists? " + bfs.findPath(root, 13));
        bfs.sop("Is 11 exists? " + bfs.findPath(root, 11));
        bfs.sop("Is 14 exists? " + bfs.findPath(root, 14));

    }

    public void sop(Object o) {
        System.out.println(o);
    }
}
