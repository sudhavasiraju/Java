package com.sample.toh;

import java.util.Stack;

/**
 * Created by sudhakar.vasiraju on 3/19/16.
 */
public class Tower {
    private  int index;
    private Stack<Integer> disks;

    public int getIndex(){
        return index;
    }

    public Stack<Integer> getDisks() {
        return disks;
    }

    public Tower(int index) {
        this.index = index;
        disks = new Stack<Integer>();
    }

    public void moveTopDiskTo(Tower t){
        Integer topDisk = disks.pop();
        t.disks.push(topDisk);
        sop("moving disk "+topDisk+" from tower "+this.index+" to "+t.index);
    }

    public void addDisk(int disk) {
        if (!disks.isEmpty() && disks.peek() < disk) {
            sop("You shouldn't place disk "+disk+" on top of "+disks.peek());
        }else{
            disks.push(disk);
        }
    }

    public void moveDisks(int disk, Tower destination, Tower buffer){

        if (disk > 0) {
            moveDisks(disk-1, buffer, destination);
            moveTopDiskTo(destination);
            buffer.moveDisks(disk - 1, destination, this);
        }

    }

    public void sop(Object o) {System.out.println(o);}
}
