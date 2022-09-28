package ru.postlife.hibernate;

import ru.postlife.hibernate.model.Student;
import ru.postlife.hibernate.services.StudentService;
import ru.postlife.hibernate.services.StudentServiceImpl;

public class HibernateApp {
    public static void main(String[] args) {
        StudentService userService = new StudentServiceImpl();

        int COUNT = 1000;
        for (int i = 0; i < COUNT; i++) {
            userService.saveStudent(new Student(i + 1, String.format("Student %s", i + 1), (i + 1) % 5));
        }

        System.out.println("Count of student in DB " + userService.findAllStudents().size());
        userService.deleteStudent(new Student(1, "Student 1", 1));
        System.out.println("Count of student in DB after delete " + userService.findAllStudents().size());
        Student student = userService.findStudent(2);
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Mark: " + student.getMark());
        student.setMark(5);
        userService.updateStudent(student);
        student = userService.findStudent(2);
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Mark: " + student.getMark());
    }
}
