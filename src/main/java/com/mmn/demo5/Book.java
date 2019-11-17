package com.mmn.demo5;

public class Book {
    boolean checkOUt = false;

    public Book(boolean checkOUt) {
        this.checkOUt = checkOUt;
    }

    void checkIn() {
        checkOUt = false;
    }

    protected void finalized() {
        if (checkOUt) {
            System.out.println("Error: check out");

        }

    }
}
