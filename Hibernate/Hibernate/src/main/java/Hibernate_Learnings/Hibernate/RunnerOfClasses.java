package Hibernate_Learnings.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerOfClasses {

    Laptop laptop = new Laptop();
    laptop.setlId(1);
    laptop.setlName("Lenovo");

    Student student = new Student();
    student.setRollnumber(101);
    student.setStudentName("Abis");
    student.setMarks(66.5);

    // Now for saving these details use session of Hibernate

    Configuration con = new Configuration().configure().addAnnotatedClass(Aliens.class);
    SessionFactory sf= con.buildSessionFactory();
    Session session = sf.openSession();

    Transaction tx =session.beginTransaction(); // Push all data with help of commit/ Now for saving these details use session of Hibernate

    session.save();
    tx.commit();
}
