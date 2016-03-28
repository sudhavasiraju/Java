package com.sample.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudhakar.vasiraju on 3/26/16.
 */
public class TreeNode {

    private int data;
    List<TreeNode> children = null;
    private boolean visited;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
        this.visited = false;
    }

    public boolean addChild(int data) {
        boolean returnVal = false;
        TreeNode child = new TreeNode(data);
        returnVal = this.children.add(child);
        return returnVal;
    }

    public boolean addChild(TreeNode child) {
        boolean returnVal = false;
        returnVal = this.children.add(child);
        return returnVal;
    }


    public List<TreeNode> getUnvisitedChildren(){
        List<TreeNode> unVisitedChildren = new ArrayList<TreeNode>();

        List<TreeNode> children = this.children;
        for (TreeNode node:children) {
            if (!node.visited) {
                unVisitedChildren.add(node);
            }
        }

        return unVisitedChildren;
    }

    public TreeNode getUnvisitedChildForDFS(){
        TreeNode returnVal = null;
        for (TreeNode node:this.children) {
            if (!node.visited()) {
                returnVal = node;
                break;
            }
        }
        return returnVal;
    }

    public void makeAllUnVisited(){

        this.setVisited(false);
        setUnivisitedForAll(this.children);
    }

    private void setUnivisitedForAll(List<TreeNode> children) {
        if (children == null ) return;
        for (TreeNode child:children) {
            child.setVisited(false);
            setUnivisitedForAll(child.children);
        }

    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean visited() {
        return  this.visited;
    }

    public int data(){
      return this.data;
    }
}
