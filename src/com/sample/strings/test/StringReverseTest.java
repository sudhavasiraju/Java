package com.sample.strings.test;

import com.sample.strings.StringReverse;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sudhakar.vasiraju on 3/17/16.
 */
public class StringReverseTest {

    @Test
    public void testRecursiveReverse() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.recursiveReverse("123abc");

        assertEquals("Result should be cba321","cba321",result);
    }

    @Test
    public void testRecursiveReverse1() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.recursiveReverse("a b c d ");

        assertEquals("result should be  d c b a"," d c b a",result);
    }

    @Test
    public void testRecursiveReverse2() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.recursiveReverse("");

        assertEquals("result should be empay string","",result);
    }

    @Test
    public void testRecursiveReverse3() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.recursiveReverse(null);

        assertEquals("result should be empty string","",result);
    }

    @Test
    public void testRecursiveReverse4() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.recursiveReverse("madamimadam");

        assertEquals("result should be ","madamimadam",result);
    }


    @Test
    public void testNonRecursiveReverse() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.nonRecursiveReverse("123abc");

        assertEquals("Result should be cba321","cba321",result);
    }

    @Test
    public void testNonRecursiveReverse1() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.nonRecursiveReverse("a b c d ");

        assertEquals("result should be  d c b a"," d c b a",result);
    }

    @Test
    public void testNonRecursiveReverse2() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.nonRecursiveReverse("");

        assertEquals("result should be empay string","",result);
    }

    @Test
    public void testNonRecursiveReverse3() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.nonRecursiveReverse(null);

        assertEquals("result should be empty string","",result);
    }

    @Test
    public void testNonRecursiveReverse4() throws Exception {
        StringReverse sr = new StringReverse();
        String result = sr.nonRecursiveReverse("madamimadam");

        assertEquals("result should be ","madamimadam",result);
    }
}