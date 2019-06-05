package com.company;

import com.company.Rank_Up.Tortoise_racing;

public class Main {

    public static void main(String[] args) {
        String string = "abracadabra";
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int [] tr = Tortoise_racing.race(720, 850, 70);
        System.out.println(tr[0] +":"+tr[1]+":"+tr[2]);

    }
}
