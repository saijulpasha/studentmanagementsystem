package com.sahil.studentmanagement;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateStudent {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, 1);
        if (student != null) {
            student.setCourse("Hibernate");
            session.update(student);
            tx.commit();
            System.out.println("Student updated!");
        } else {
            System.out.println("Student not found.");
        }
        session.close();
    }
}

