package com.sample.general;

/**
 * Created by sudhakar.vasiraju on 4/15/16.
 */
public class Fibonacci {

    public Fibonacci(){

    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibWithRecursion(20);
        fibonacci.printFibIterative(20);
    }

    public void printFibIterative(int max) {
        sopl(" ");
        long first = 0;
        long second = 1;
        for (int i = 0; i <= max; i++) {
            sop(first + " ");
            first = first + second;
            second = first - second;
        }
    }

    public void printFibWithRecursion(int max) {
        for (int i = 0; i <= max; i++) {
            sop(fib(i)+" ");
        }
    }

    public int fib(int x){
        if (x < 2) return x;
        return (fib(x-1) + fib(x-2));
    }

    public void sopl(Object o){
        System.out.println(o);
    }

    public void sop(Object o){
        System.out.print(o);
    }
}
