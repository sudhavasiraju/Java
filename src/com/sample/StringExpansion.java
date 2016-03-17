package com.sample;

/**
 * Created by sudhakar.vasiraju on 3/16/16.
 */

import java.lang.System;

public class StringExpansion {

    public static void main(String[] args) {
        new StringExpansion();
    }

    public StringExpansion(){
        //sop(charCountInString("3"));
        //sop(expandStringForNums("a4b13c0d4"));
    }

    public String charCountInString(String input) {
        StringBuffer returnVal = new StringBuffer();

        if (input != null && input.length() > 0) {
            if (input.length() == 1) {
                returnVal.append(input.charAt(0));
                returnVal.append("1");
            } else {
                int j = 0, k = 1;
                for (int i = 1; i < input.length(); i++) {
                    if (input.charAt(j) == input.charAt(i)) {
                        k++;
                    } else {
                        returnVal.append(input.charAt(j));
                        returnVal.append(k);
                        k = 1;
                        j = i;
                    }
                    if (i == input.length() - 1) {
                        returnVal.append(input.charAt(j));
                        returnVal.append(k);
                    }
                }
            }
        }
        return  returnVal.toString();
    }

    public String expandStringForNums(String input) {
        StringBuffer returnVal = new StringBuffer();

        if (input != null && input.length() > 0 ){
            int count = 0;
            Character temp = null;
            int charCount = 0;
            for (Character c: input.toCharArray()) {
                charCount++;
                if (Character.isDigit(c)) {
                    count = count * 10 + Character.getNumericValue(c);
                    if (Character.getNumericValue(c) == 0 ){
                        if (temp != null ) {
                            returnVal.deleteCharAt(returnVal.length() - 1);
                            temp = null;
                        }
                    }
                    if (input.length() == charCount) {
                        if (count > 0) {
                            count --;
                            while (count > 0) {
                                count--;
                                if (null != temp) {
                                    returnVal.append(temp);
                                }
                            }
                        }
                    }
                } else {
                    if (count > 0) {
                        count --;
                        while (count > 0) {
                            count--;
                            if (null != temp) {
                                returnVal.append(temp);
                            }
                        }
                    }
                    if (count == 0) {
                        returnVal.append(c);
                        temp = c;
                        count = 0;
                    }


                }
            }
        }

        return returnVal.toString();
    }

    public int countNumberOfOccurences(int a, int b) {
        int count = 0;

        for (int i=0; i<a; i++) {
            if (Integer.toString(i).indexOf(Integer.toString(b)) != -1) count++;
        }

        return count;
    }

    public void sop(Object o) {
        System.out.println(o);
    }
}
