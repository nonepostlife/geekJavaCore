package ru.postlife.hibernate.services;

import ru.postlife.hibernate.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();

    Student findStudent(int id);

    void saveStudent(Student user);

    void deleteStudent(Student user);

    void updateStudent(Student user);
}
