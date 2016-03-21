package com.sample.longestconcatword;

import java.util.Comparator;

/**
 * Created by sudhakar.vasiraju on 3/20/16.
 */
public class WordComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return (o1.length() >= o2.length()) ? -1:1;
    }
}
