package com.sample.prefixtree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudhakar.vasiraju on 3/17/16.
 */
public class PrefixTree {

    public final Trie rootNode;
    public final int offset = 97; //ASCII of a

    public PrefixTree(){
        rootNode = new Trie('\0', false);
    }

    public void insertWord(String word) {

        int length = word.length();
        Trie node = rootNode;

        for (int i=0; i<length; i++) {
            Character temp = word.charAt(i);
            if (node.trieArray[temp - offset] == null) {
                node.trieArray[temp - offset] = new Trie(temp , i == (length - 1)?true:false);
            } else {
                if (i == (length - 1)) node.trieArray[temp-offset].word = true;
            }
            node = node.trieArray[temp - offset];
        }
    }

    public boolean findWord(String word) {

        Trie node = rootNode;

        for (Character c:word.toCharArray()) {
            if (node == null) {
                return false;
            }else {
                node = node.trieArray[c - offset];
            }
        }
        if (node == null || !node.word) {
            return  false;
        }
        return true;
    }

    public void printWords(Trie node, int depth, Character[] charArray){

        if (node == null ){
            return;
        }
        for (int i=0; i<node.trieArray.length; i++) {
            charArray[depth] = node.character;
            printWords(node.trieArray[i], depth+1, charArray);
        }
        if (node.word) {
            for (int j=1; j <= depth; j++) {
                sop(charArray[j]);
            }
            sopl("");
        }
    }

    public static void main(String[] args){
        PrefixTree prefixTree = new PrefixTree();

        List<String> stringList = new ArrayList<String>();
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
        //char[] charArray = new char[100];
        prefixTree.printWords(prefixTree.rootNode, 0, new Character[100]);
        sopl(prefixTree.findWord("a"));

    }

    public static void sopl(Object o) {
        System.out.println(o);
    }
    public void sop(Object o) {
        System.out.print(o);
    }

}

class Trie{
    Character character;
    Trie[] trieArray;
    boolean word;

    public Trie(Character c,boolean word) {
        this.character = c;
        this.trieArray = new Trie[26];
        this.word = word;
    }
}