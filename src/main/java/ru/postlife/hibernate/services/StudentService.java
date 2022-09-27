package ru.postlife.hibernate.services;

import ru.postlife.hibernate.dao.StudentDao;
import ru.postlife.hibernate.model.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentDao = new StudentDao();

    public StudentService() {
    }

    public List<Student> findAllStudents() {
        return studentDao.findAll();
    }

    public Student findStudent(int id) {
        return studentDao.findById(id);
    }

    public void saveStudent(Student user) {
        studentDao.save(user);
    }

    public void deleteStudent(Student user) {
        studentDao.delete(user);
    }

    public void updateStudent(Student user) {
        studentDao.update(user);
    }
}
