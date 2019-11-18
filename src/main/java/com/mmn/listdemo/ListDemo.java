package com.mmn.listdemo;

import java.util.*;

/**
 * List的基本方法
 * @author mmn
 * @date 2019-11-17
 */
public class ListDemo {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        a.add("x");
        a.add(1, "c");


        b = a.contains("1");
        System.out.println("------1-----" + b);
        s = a.get(1);
        System.out.println("------2-----" + s);
        i = a.indexOf("1");
        System.out.println("------3-----" + i);
        b = a.isEmpty();
        System.out.println("------4-----" + b);
        it = a.iterator();
        while (it.hasNext()) {
            System.out.println("-------it-----" + it.next());
        }
        lit = a.listIterator();

        System.out.println("------6-----" + lit);
        lit = a.listIterator(2);
        System.out.println("------7-----" + lit);

    }


    public static void main(String[] args) {
        basicTest(new ArrayList<String>(Arrays.asList("a", "b")));
    }
}
