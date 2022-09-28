package ru.postlife.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.postlife.hibernate.model.Student;
import ru.postlife.hibernate.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private SessionFactory sessionFactory;

    public StudentDaoImpl() {
        this.sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();
    }

    public List<Student> findAll() {
        List<Student> users = (List<Student>) sessionFactory.openSession().createQuery("From Student").list();
        return users;
    }

    public Student findById(int id) {
        return sessionFactory.openSession().get(Student.class, id);
    }

    public void save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(student);
        tx1.commit();
        session.close();
    }

    public void update(Student student) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();
    }

    public void delete(Student student) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(student);
        tx1.commit();
        session.close();
    }
}
