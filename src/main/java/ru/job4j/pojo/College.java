package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Ivanov");
        student.setGroup(1);
        student.setEnroll(new Date());

        System.out.println(student.getFullName() + " is a student of group #" + student.getGroup() + " : " + student.getEnroll());
    }
}
