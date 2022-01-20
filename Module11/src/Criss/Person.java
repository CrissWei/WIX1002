package Criss;

import java.util.ArrayList;

public class Person {
    public static void main(String[] args) {
        Student student = new Student(23,"Criss");

        ArrayList<Student> stu = new ArrayList<>();
        stu.add(student);
        System.out.println(stu.get(0));//Student{age=23, name='Criss'}
    }
}
