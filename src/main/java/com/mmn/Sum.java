package com.mmn;

public class Sum {

    /**
     * 求和
     * @param args
     */
    public static void main(String[] args) {
        double i = 1;
        double n = 4;

        double a = 2;
        double sum = 0;
        for (int j = 0; j < n; j++) {
//            j=j+1;
            double temp = a;
            sum = sum + (a)/i;
            a = a + i;
            i = temp;
            System.out.println(j + "数据为:" + a + "/" + i);
        }

        System.out.println("最后的和为：" + sum);
    }
}
