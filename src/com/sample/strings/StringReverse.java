package com.sample.strings;

/**
 * Created by sudhakar.vasiraju on 3/17/16.
 */
public class StringReverse {

    public StringReverse(){
        //sop(recursiveReverse("abc def"));
        //sop(nonRecursiveReverse("abc def"));
    }

    public static void main(String[] args){
        new StringReverse();

    }

    public String recursiveReverse(String input) {

        if (input != null && input.length() > 0) {
            if (input.length() == 1) {
                return input;
            }else{
                return input.charAt(input.length() -1 ) + recursiveReverse(input.substring(0, input.length() - 1));
            }
        }else {
            return "";
        }
    }

    public String nonRecursiveReverse(String input) {
        StringBuffer returnVal = new StringBuffer();

        if (input != null && input.length() > 0 ) {
            if (input.length() == 1) {
                returnVal.append(input.charAt(0));
            }else {
                returnVal.append(input);
                int count = input.length() - 1;
                int j = count;
                for (int i = 0; i <= j / 2; i++, count--) {
                    Character temp = input.charAt(i);
                    returnVal.setCharAt(i, input.charAt(count));
                    returnVal.setCharAt(count, temp);
                }
            }
        }

        return returnVal.toString();
    }




    public void sop(Object o) {
        System.out.println(o);
    }
}
