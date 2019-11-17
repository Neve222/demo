package com.mmn.domain;

import java.util.Objects;

/**
 * @author mmn
 * @date 2019-11-07
 */
public class Student {
    private Integer cno;

    private String name;

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer cno, String name) {
        this.cno = cno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cno=" + cno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(cno, student.cno) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cno, name);
    }
}
