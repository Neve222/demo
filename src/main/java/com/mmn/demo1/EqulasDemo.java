package com.mmn.demo1;

import com.mmn.domain.Person;

/**
 * @author mmn
 * @date 2019-08-12 16:42
 */
public class EqulasDemo {

    public static void main(String[] args) {
        Long l = 42L;
        Person person = new Person();
        int i = person.hashCode();

        int code = person.hashCode();


        System.out.println(i);
        System.out.println(code);

        System.out.println(i == code);
        System.out.println(String.valueOf(i).equals(String.valueOf(code)));


    }
}
