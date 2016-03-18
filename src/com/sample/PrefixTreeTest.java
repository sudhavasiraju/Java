package com.sample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sudhakar.vasiraju on 3/18/16.
 */
public class PrefixTreeTest {
    PrefixTree prefixTree;
    List<String> stringList = new ArrayList<String>();


    @Before
    public void setUp() throws Exception {
        prefixTree = new PrefixTree();
        stringList.add("abc");
        stringList.add("mno");
        stringList.add("abcdef");
        stringList.add("abcmonghiklm");
        stringList.add("a");
        stringList.add("defghi");
        stringList.add("mo");

        for (String word:stringList) {
            prefixTree.insertWord(word);
        }
    }

    @Test
    public void testFindWord() throws Exception {
        assertTrue("abc should be there in the list", prefixTree.findWord("abc"));
    }

    @Test
    public void testFindWord2() throws Exception {
        assertTrue("a should be there in the list", prefixTree.findWord("a"));
    }

    @Test
    public void testFindWord3() throws Exception {
        assertFalse("mn should not be there in the list", prefixTree.findWord("mn"));
    }

    @Test
    public void testFindWord4() throws Exception {
        assertFalse("mnop should not be there in the list", prefixTree.findWord("mnop"));
    }
}