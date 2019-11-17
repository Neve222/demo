package com.mmn.map;

import com.mmn.domain.Student;

import java.util.HashMap;

/**
 * @author mmn
 * @date 2019-11-07
 */
public class HashMapDemo {
    public static void main(String[] args) {
       Student student1 = new Student(1, "a");
       Student student2 = new Student(1, "a");

        HashMap<Student, Integer> map1 = new HashMap<>(16);
        map1.put(student1, 1);

        map1.put(null,1);

        System.out.println(map1);
        System.out.println(student1.equals(student2));
        System.out.println(map1.containsKey(student2));
    }
}
