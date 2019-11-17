package com.mmn.demo2;

import java.util.Random;

/**
 * @author neve
 */
public class Demo2_1 {
    static int a;
    static char b;

    public static void main(String[] args) {
        Random random = new Random(47);
       int i, j, k;
        j = random.nextInt(100) + 1;
        k = random.nextInt(100) + 1;
        i = random.nextInt(100) + 1;
        System.out.println(j);
        System.out.println(k);
        System.out.println(i);
    }

}
