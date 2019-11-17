package com.mmn.demo1;

import java.util.Random;

/**
 * @author mmn
 * @date 2019-08-28 16:41
 */
public class CoinDemo {

    public boolean coinAchieve() {
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
//            System.out.println("正面");
            return true;
        } else {
//            System.out.println("反面");
            return false;
        }
    }
    /**
     * 抛硬币游戏
     * @param args
     */
    public static void main(String[] args) {

        CoinDemo coinDemo = new CoinDemo();
        int zff = 0;
        int ffz = 0;

        for (int j = 0 ; j < 10; j++) {
            boolean result = coinDemo.coinAchieve();
            if (result == true) {

            } else {

            }
        }
    }
}
