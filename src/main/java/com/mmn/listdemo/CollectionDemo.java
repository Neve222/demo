package com.mmn.listdemo;

import com.mmn.domain.Person;

import java.util.*;

/**
 * @author mmn
 * @date 2019-08-19 11:23
 */
public class CollectionDemo {

    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("a", 13));
        hashSet.add(new Person("b", 14));
        hashSet.add(new Person("e", 13));
        hashSet.add(new Person("c", 15));
        hashSet.add(new Person("c", 17));


//        TreeSet<Person> treeSet = new TreeSet<>();
//
//        treeSet.add(new Person("a", 13));
//        treeSet.add(new Person("b", 14));
//        treeSet.add(new Person("e", 13));
//        treeSet.add(new Person("c", 15));

        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person("a", 13));
        linkedHashSet.add(new Person("b", 14));
        linkedHashSet.add(new Person("e", 13));
        linkedHashSet.add(new Person("c", 15));
        linkedHashSet.add(new Person("c", 17));

/*
        for (Object data : Arrays.asList("D",1,2,"A","C","B")) {
            hashSet.add(data);
//            treeSet.add(data);
            linkedHashSet.add(data);
            System.out.println("@@@@@@@@@@@");
            System.out.println(hashSet);
            System.out.println(treeSet);
        }*/


        for (int i = 0; i < 10; i++) {
            System.out.println(hashSet);
//            System.out.println(treeSet);
            System.out.println(linkedHashSet);
            System.out.println("============");
        }



    }



}
