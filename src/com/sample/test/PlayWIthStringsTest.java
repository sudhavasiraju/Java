package com.sample.test;

import com.sample.PlayWIthStrings;
import junit.framework.TestCase;

/**
 * Created by sudhakar.vasiraju on 3/16/16.
 */

public class PlayWIthStringsTest extends TestCase{

    public void testCharCountInString(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.charCountInString("aaaabbccccdddd");

        assertEquals("Expected out put is a4b2c4d4","a4b2c4d4",result);
    }

    public void testCharCountInString1(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.charCountInString("abababab");

        assertEquals("Expected out put is a1b1a1b1a1b1a1b1","a1b1a1b1a1b1a1b1",result);
    }

    public void testCharCountInString2(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.charCountInString("a");

        assertEquals("Expected out put is a1","a1",result);
    }

    public void testCharCountInString3(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.charCountInString("3");

        assertEquals("Expected out put is 31","31",result);
    }

    public void testExpandStringForNums(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.expandStringForNums("a4b13c2d4");

        assertEquals("Expected out put is aaaabbbbbbbbbbbbbccdddd","aaaabbbbbbbbbbbbbccdddd",result);
    }

    public void testExpandStringForNums1(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.expandStringForNums("a4b3c0d2");

        assertEquals("Expected out put is aaaabbbdd","aaaabbbdd",result);
    }

    public void testExpandStringForNums2(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.expandStringForNums("a4b3cd2");

        assertEquals("Expected out put is aaaabbbcdd","aaaabbbcdd",result);
    }

    public void testExpandStringForNums3(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.expandStringForNums("a4b3c$d");

        assertEquals("Expected out put is aaaabbbc$d","aaaabbbc$d",result);
    }

    public void testExpandStringForNums4(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.expandStringForNums("a4b3c2d");

        assertEquals("Expected out put is aaaabbbccd","aaaabbbccd",result);
    }

    public void testExpandStringForNums5(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.expandStringForNums("a4b3c2d0");

        assertEquals("Expected out put is aaaabbbcc","aaaabbbcc",result);
    }

    public void testExpandStringForNums6(){
        PlayWIthStrings se = new PlayWIthStrings();
        String result = se.expandStringForNums("a4b000c2d0");

        assertEquals("Expected out put is aaaacc","aaaacc",result);
    }

    public void testCountNumberOfOccurences() {
        PlayWIthStrings se = new PlayWIthStrings();
        int result = se.countNumberOfOccurences(10, 1);

        assertEquals("Expected out put is 1",1,result);
    }

    public void testCountNumberOfOccurences1() {
        PlayWIthStrings se = new PlayWIthStrings();
        int result = se.countNumberOfOccurences(21,0);

        assertEquals("Expected out put is 3",3,result);
    }

    public void testCountNumberOfOccurences2() {
        PlayWIthStrings se = new PlayWIthStrings();
        int result = se.countNumberOfOccurences(30,2);

        assertEquals("Expected out put is 12",12,result);
    }

    public void testCountNumberOfOccurences3() {
        PlayWIthStrings se = new PlayWIthStrings();
        int result = se.countNumberOfOccurences(100,9);

        assertEquals("Expected out put is 19",19,result);
    }
}