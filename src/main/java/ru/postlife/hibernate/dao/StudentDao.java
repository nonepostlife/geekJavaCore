package ru.postlife.hibernate.dao;

import ru.postlife.hibernate.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();

    Student findById(int id);

    void save(Student student);

    void update(Student student);

    void delete(Student student);
}
