package Hibernate_Learnings.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class RunnerOfClasses {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setlId(14);
        laptop.setlName("Mac_M5_PRO_MAX");


        Student student = new Student();
        student.setRollnumber(114);
        student.setStudentName("SSS");
        student.setMarks(63);

        // 1t1
//        student.setLaptop(laptop);

        //1ToMany
        student.getlList().add(laptop);

        student.getLaptop(laptop);

        //Many TO Many
        laptop.getStudent1().add(student);


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
