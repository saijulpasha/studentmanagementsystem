package com.sahil.studentmanagement;

import org.hibernate.Session;

public class GetStudentById {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = session.get(Student.class, 1);

        if (student != null) {
            System.out.println(student.getId() + " | " + student.getName() + " | " + student.getEmail() + " | " + student.getCourse());
        } else {
            System.out.println("Student not found.");
        }

        session.close();
    }
}
