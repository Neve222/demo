package com.mmn.demo5;

public class FinalizeDemo5_5 {
    public static void main(String[] args) {
        Book novel = new Book(true);

        novel.checkIn();

        new Book(true);

        System.gc();
    }
}
