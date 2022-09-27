package ru.postlife.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.postlife.hibernate.model.Student;
import ru.postlife.hibernate.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class StudentDao {

    public List<Student> findAll() {
        List<Student> users = (List<Student>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Student").list();
        return users;
    }

    public Student findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public void save(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(student);
        tx1.commit();
        session.close();
    }

    public void update(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();
    }

    public void delete(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(student);
        tx1.commit();
        session.close();
    }
}
