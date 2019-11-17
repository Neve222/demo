package com.mmn.demo1;

/**
 * @author mmn
 * @date 2019-07-31 15:01
 */
public class StaticDemo {

    private static final String STATIC_FILED = "静态变量";

    String FILED = "变量";

    static {
        System.out.println(STATIC_FILED);
        System.out.println("静态初始化块");
    }

    {
        System.out.println(FILED);
        System.out.println("初始化块");
    }

    public StaticDemo() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        new StaticDemo();
    }
}
