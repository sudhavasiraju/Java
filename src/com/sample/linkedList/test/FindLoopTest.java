package com.sample.linkedList.test;

import com.sample.linkedList.FindLoop;
import com.sample.linkedList.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sudhakar.vasiraju on 3/24/16.
 */
public class FindLoopTest {

    @Test
    public void testPrintList() throws Exception {
        int count = 10;
        Node rootNode = new Node(1);
        Node node;
        for (int i=2; i<=count; i++)
        {
            node = new Node(i);
            rootNode.insertNodeAtEnd(node);
        }

        FindLoop findLoop = new FindLoop();
        Node n =findLoop.returnBegninningOfLoop(rootNode);
        assertNull("beginning of loop should be null ", n);

        List<Integer> val = findLoop.printList(rootNode);
        assertEquals("lenghth should be 10", 10, val.size());
        for (int i=0; i<count; i++){
            assertEquals("return value should be equal to ", Integer.valueOf(i + 1), val.get(i));
        }

    }

    @Test
    public void testPrintList1() throws Exception {
        int count = 10;
        Node rootNode = new Node(1);
        Node node;
        Node fifthNode = null;
        for (int i=2; i<=count; i++)
        {
            node = new Node(i);
            if (i == 5) fifthNode = node;
            rootNode.insertNodeAtEnd(node);
        }

        rootNode.insertNodeAtEnd(fifthNode);

        FindLoop findLoop = new FindLoop();
        Node n =findLoop.returnBegninningOfLoop(rootNode);
        assertNotNull("beginning of loop should not be null ",n);
        assertEquals(" loop should start at 5", 5, n.getData());

        List<Integer> val = findLoop.printList(rootNode);
        assertEquals("lenghth should be 11", 11, val.size());
        for (int i=0; i<count; i++){
            assertEquals("return value should be equal to ", Integer.valueOf(i + 1), val.get(i));
        }
        assertEquals("Last node value should be 5 as there is a loop", Integer.valueOf(5), val.get(count));
    }

    @Test
    public void testPrintList2() throws Exception {
        int count = 2;
        Node rootNode = new Node(1);
        Node node;
        for (int i=2; i<=count; i++)
        {
            node = new Node(i);
            rootNode.insertNodeAtEnd(node);
        }


        FindLoop findLoop = new FindLoop();
        Node n =findLoop.returnBegninningOfLoop(rootNode);
        assertNull("beginning of loop should not be null ", n);

        List<Integer> val = findLoop.printList(rootNode);
        assertEquals("lenghth should be 2", 2, val.size());
        for (int i=0; i<count; i++){
            assertEquals("return value should be equal to ", Integer.valueOf(i + 1), val.get(i));
        }
    }

    @Test
    public void testPrintList3() throws Exception {
        int count = 2;
        Node rootNode = new Node(1);
        Node secondNode = new Node(2);
        rootNode.insertNodeAtEnd(secondNode);
        rootNode.insertNodeAtEnd(rootNode);

        FindLoop findLoop = new FindLoop();
        Node n =findLoop.returnBegninningOfLoop(rootNode);
        assertNotNull("beginning of loop should not be null ", n);
        assertEquals(" loop should start at 1", 1, n.getData());

        List<Integer> val = findLoop.printList(rootNode);
        assertEquals("lenghth should be 3", 3, val.size());
        for (int i=0; i<count; i++){
            assertEquals("return value should be equal to ", Integer.valueOf(i + 1), val.get(i));
        }
        assertEquals("Last node value should be 1 as there is a loop", Integer.valueOf(1), val.get(count));
    }

    @Test
    public void testPrintList4() throws Exception {
        int count = 1;
        Node rootNode = new Node(1);
        rootNode.insertNodeAtEnd(rootNode);

        FindLoop findLoop = new FindLoop();
        Node n =findLoop.returnBegninningOfLoop(rootNode);
        assertNotNull("beginning of loop should not be null ", n);
        assertEquals(" loop should start at 1", 1, n.getData());

        List<Integer> val = findLoop.printList(rootNode);
        assertEquals("lenghth should be 2", 2, val.size());
        for (int i=0; i<count; i++){
            assertEquals("return value should be equal to ", Integer.valueOf(i + 1), val.get(i));
        }
        assertEquals("Last node value should be 1 as there is a loop", Integer.valueOf(1), val.get(count));
    }
}