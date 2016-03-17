package com.sample.test;

import com.sample.StringExpansion;
import junit.framework.TestCase;

import static org.junit.Assert.*;

/**
 * Created by sudhakar.vasiraju on 3/16/16.
 */

public class StringExpansionTest extends TestCase{

    public void testCharCountInString(){
        StringExpansion se = new StringExpansion();
        String result = se.charCountInString("aaaabbccccdddd");

        assertEquals("Expected out put is a4b2c4d4","a4b2c4d4",result);
    }

    public void testCharCountInString1(){
        StringExpansion se = new StringExpansion();
        String result = se.charCountInString("abababab");

        assertEquals("Expected out put is a1b1a1b1a1b1a1b1","a1b1a1b1a1b1a1b1",result);
    }

    public void testCharCountInString2(){
        StringExpansion se = new StringExpansion();
        String result = se.charCountInString("a");

        assertEquals("Expected out put is a1","a1",result);
    }

    public void testCharCountInString3(){
        StringExpansion se = new StringExpansion();
        String result = se.charCountInString("3");

        assertEquals("Expected out put is 31","31",result);
    }

    public void testExpandStringForNums(){
        StringExpansion se = new StringExpansion();
        String result = se.expandStringForNums("a4b13c2d4");

        assertEquals("Expected out put is aaaabbbbbbbbbbbbbccdddd","aaaabbbbbbbbbbbbbccdddd",result);
    }

    public void testExpandStringForNums1(){
        StringExpansion se = new StringExpansion();
        String result = se.expandStringForNums("a4b3c0d2");

        assertEquals("Expected out put is aaaabbbdd","aaaabbbdd",result);
    }

    public void testExpandStringForNums2(){
        StringExpansion se = new StringExpansion();
        String result = se.expandStringForNums("a4b3cd2");

        assertEquals("Expected out put is aaaabbbcdd","aaaabbbcdd",result);
    }

    public void testExpandStringForNums3(){
        StringExpansion se = new StringExpansion();
        String result = se.expandStringForNums("a4b3c$d");

        assertEquals("Expected out put is aaaabbbc$d","aaaabbbc$d",result);
    }

    public void testExpandStringForNums4(){
        StringExpansion se = new StringExpansion();
        String result = se.expandStringForNums("a4b3c2d");

        assertEquals("Expected out put is aaaabbbccd","aaaabbbccd",result);
    }

    public void testExpandStringForNums5(){
        StringExpansion se = new StringExpansion();
        String result = se.expandStringForNums("a4b3c2d0");

        assertEquals("Expected out put is aaaabbbcc","aaaabbbcc",result);
    }

    public void testExpandStringForNums6(){
        StringExpansion se = new StringExpansion();
        String result = se.expandStringForNums("a4b000c2d0");

        assertEquals("Expected out put is aaaacc","aaaacc",result);
    }

}