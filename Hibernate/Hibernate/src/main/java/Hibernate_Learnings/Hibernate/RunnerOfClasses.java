package Hibernate_Learnings.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class RunnerOfClasses {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setlId(6);
        laptop.setlName("Mac_M1");
        //ManyToOne




        Student student = new Student();
        student.setRollnumber(107);
        student.setStudentName("KK");
        student.setMarks(53);

        // 1t1
//        student.setLaptop(laptop);

        //1ToMany
        student.getlList().add(laptop);



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
