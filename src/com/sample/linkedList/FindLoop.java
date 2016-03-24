package com.sample.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sudhakar.vasiraju on 3/22/16.
 */
public class FindLoop {

    public static void main(String[] args) {
        Node one = new Node(1);
        one.insertNodeAtEnd(2);
        one.insertNodeAtEnd(3);
        one.insertNodeAtEnd(4);
        Node five = new Node(5);
        one.insertNodeAtEnd(five);
        one.insertNodeAtEnd(6);
        one.insertNodeAtEnd(7);
        one.insertNodeAtEnd(8);
        one.insertNodeAtEnd(9);
        one.insertNodeAtEnd(10);
        one.insertNodeAtEnd(11);
        one.insertNodeAtEnd(five);

        FindLoop findLoop = new FindLoop();
        findLoop.printList(one);
    }

    public List<Integer> printList(Node head){
        Node loopStart = returnBegninningOfLoop(head);
        List<Integer> returnVal = new ArrayList<>();
        Node current = head;
        if ( loopStart == null) {
            while (current != null) {
                //sop(current.getData() +" ");
                returnVal.add(current.getData());
                current = current.getNext();
            }
         //   sopl("");
        } else {
           int count = 0;
           while ((current.getData() != loopStart.getData()) || (current.getData() == loopStart.getData() && count == 0)) {
               //sop (current.getData() + " ");
               returnVal.add(current.getData());
               if (current.getData() == loopStart.getData()) count++;
               current = current.getNext();
           }
           //sop(loopStart.getData());
            returnVal.add(loopStart.getData());
        }
        return returnVal;
    }

    public Node returnBegninningOfLoop(Node head){

        if (head == null || head.getNext() == null) return null;

        Node first = head;
        Node second = head;
        boolean isLoop = false;

        while (second.getNext() != null) {
            first = first.getNext();
            second = second.getNext().getNext();

            if (second == null) {
                return null;
            }

            if (first.getData() == second.getData()) {
                isLoop = true;
                break;
            }

        }

        if (isLoop) {
            second = head;

            while (first.getData() != second.getData()) {
                first = first.getNext();
                second = second.getNext();
            }
            return first;
        }else {
            return null;
        }
    }

    public void sop(Object o) {System.out.print(o);}
    public void sopl(Object o) {System.out.println(o);}
}
