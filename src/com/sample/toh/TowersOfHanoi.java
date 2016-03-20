package com.sample.toh;

/**
 * Created by sudhakar.vasiraju on 3/19/16.
 */
public class TowersOfHanoi {
    public static void main(String[] args) {
        Tower[] towers = new Tower[3];
        int n = 5;

        for (int i=0; i<3; i++) {
            towers[i] = new Tower(i);
        }

        for (int i=n-1; i >= 0; i--) {
            towers[0].addDisk(i);
        }

        towers[0].moveDisks(n,towers[2], towers[1]);
    }
}
