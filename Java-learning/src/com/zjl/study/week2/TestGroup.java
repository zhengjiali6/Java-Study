package com.zjl.study.week2;


import java.util.Date;

/**
 * @ClassName TestGroup
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/12
 **/

public class TestGroup<students> {
    public static void main(String[] args) {
        Book book1 = new Book("Java", 100, new Date());
        Book book2 = new Book("JS", 50, new Date());
        Book book3 = new Book("Mysql", 44, new Date());
        Book book4 = new Book("Linux", 66, new Date());
        Book book5 = new Book("Python", 77, new Date());

        Phone phone1 = new Phone("iPhone", 100);
        Phone phone2 = new Phone("HuaWei", 100);
        Phone phone3 = new Phone("OppO", 100);
        Phone phone4 = new Phone("RedMi", 100);

        Student student1 = new Student("1001", "小郑", "女", phone1, new Book[]{book1, book4});
        Student student2 = new Student("1002", "小王", "男", phone1, new Book[]{book1, book2, book4});
        Student student3 = new Student("1003", "小胖", "女", phone1, new Book[]{book1, book4});
        Student student4 = new Student("1004", "小李", "男", phone1, new Book[]{book2, book3, book4});

        Group group1 = new Group("第一组", new Student[]{student1, student2});
        Group group2 = new Group("第二组", new Student[]{student3, student4});

        Student[] students = group1.getStudents();
        for (Student student: students) {

            System.out.println(student.getStudentName());
        }
    }

}
