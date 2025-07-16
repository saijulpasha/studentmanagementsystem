package com.sahil.studentmanagement;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertStudent {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student();
        student.setName("suhail");
        student.setEmail("suhail@example.com");
        student.setCourse("sql");

        session.save(student);
        tx.commit();
        session.close();

        System.out.println("Student inserted successfully!");
    }
}
