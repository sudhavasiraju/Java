package com.sample.longestconcatword;

import java.io.*;
import java.util.*;

/**
 * Created by sudhakar.vasiraju on 3/19/16.
 */
public class LongestConcatWord {

    private Set<String> wordSet = new TreeSet<String>(new WordComparator());
    private List<String> wordList = new ArrayList<String>();
    private List<String> concatWords = new ArrayList<>();
    private int howmany = 0;

    public void readWordsFromFile(String fileName){

        try(
            FileReader fileReader = new FileReader(new File(fileName));
            BufferedReader reader = new BufferedReader(fileReader);
            ){
                String word;
                while ( (word = reader.readLine()) != null) {
                    wordList.add(word);
                    wordSet.add(word);
                }

        }catch ( IOException | NullPointerException ex) {
            sop("Problem while reading from file: "+ex.getMessage());
        }
    }

    public void setHowmany(int howmany){
        this.howmany = howmany;
    }

    public Map<String, List<String>> findLongestWords(int number) {
        this.setHowmany(number);

        Map<String, List<String>> words = new HashMap<>();
        if (number > 0) {
            int count = 1;
            for (String word : wordSet) {
                concatWords.clear();
                boolean isConcatWord = findWhetherConcat(word, word.substring(0, 1));
                if (isConcatWord) {
                    sop(" longest concat word number "+count+" is: " + word + " and it contains words: ");
                    for (String w : concatWords) {
                        sop(w + " ");
                    }
                    words.put(word, concatWords);
                    sopl(" ");
                    if (count++ == howmany) break;
                }
            }
        }
        return words;
    }

    public boolean findWhetherConcat(String str, String subStr) {

        if (wordList.contains(subStr)) {
            concatWords.add(subStr);

            if (str.length() == subStr.length()) {
                return true;
            }else {
                str = str.substring(subStr.length());
                return  findWhetherConcat(str, str.substring(0, 1));
            }
        } else {
            if (str.length() == subStr.length()) {
                concatWords.clear();
                return  false;
            }
            return findWhetherConcat(str, str.substring(0, subStr.length()+1) );
        }

    }

    public static void main(String[] args){
        LongestConcatWord lcw = new LongestConcatWord();
        lcw.readWordsFromFile("src//com/sample//longestconcatword//words.txt");
        lcw.findLongestWords(3);

    }

    public void sop(Object o) {
        System.out.print(o);
    }
    public void sopl(Object o) {
        System.out.println(o);
    }
}
