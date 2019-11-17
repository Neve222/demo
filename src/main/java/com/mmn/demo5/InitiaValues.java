package com.mmn.demo5;

/**
 * JVM加载class：
 *           (1)检查:检查载入的class文件数据的正确性;
 *
 *           (2)准备:为类的静态变量、静态方法、静态代码块分配存储空间;
 *
 *           (3)解析:将符号引用转换成直接引用(这一步是可选的)
 */
public class InitiaValues {
    static boolean t;
    static int i;
    static double d;
    static float f;
    static char c;
    static byte b;
    static short s;
    static long l;
    static Integer integer;


    public static void main(String[] args) {
        System.out.println("t = " + t);
        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("l = " + l);

        System.out.println("integer = " + integer);


    }
}
