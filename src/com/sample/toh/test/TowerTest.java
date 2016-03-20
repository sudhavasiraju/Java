package com.sample.toh.test;

import com.sample.toh.Tower;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by sudhakar.vasiraju on 3/19/16.
 */
public class TowerTest {

    Tower[] towers = new Tower[3];
    int n = 5;
    @Before
    public void setUp() throws Exception {
        for (int i=0; i<3; i++) {
            towers[i] = new Tower(i);
        }

        for (int i=n-1; i >= 0; i--) {
            towers[0].addDisk(i);
        }
    }

    @Test
    public void testMoveDisks() throws Exception {
        towers[0].moveDisks(n, towers[2], towers[1]);

        Stack<Integer> disks = towers[2].getDisks();

        for (int i=0; i < disks.size()-1 ; i++) {
            int firstElement = disks.pop();
            assertTrue("Fist element should always less than next element ", firstElement < disks.peek());
        }
    }
}