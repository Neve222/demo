package com.mmn.demo1;

import org.junit.Test;

/**
 * @author mmn
 * @date 2019-08-02 10:58
 */
public class Test1 {

    @Test
    public void charDemo() {
        char c [] = {'h','e','l','l','o'};

        String a = "hello";
        System.out.println(a);
        System.out.println(c);
        System.out.println(a.equals(c));
    }


    @Test
    public void integerDemo() {
        Integer a = 127;
        Integer b = 127;

        Integer a1 = 128;
        Integer b1 = 128;

        System.out.println(a == b);
        System.out.println(a1 == b1);

    }
}
