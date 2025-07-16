package com.sahil.studentmanagement;

import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class GetAllStudents {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query<Student> query = session.createQuery("FROM Student", Student.class);
        List<Student> list = query.list();

        for (Student s : list) {
            System.out.println(s.getId() + " | " + s.getName() + " | " + s.getEmail() + " | " + s.getCourse());
        }

        session.close();
    }
}
