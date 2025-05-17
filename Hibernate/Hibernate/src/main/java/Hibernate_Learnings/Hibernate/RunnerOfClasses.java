package Hibernate_Learnings.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerOfClasses {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setlId(2);
        laptop.setlName("HP");


        Student student = new Student();
        student.setRollnumber(102);
        student.setStudentName("UD");
        student.setMarks(60);

        // Now for saving these details use session of Hibernate

        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx =session.beginTransaction();

        session.save(laptop);
        session.save(student);

        tx.commit();
    }
}
