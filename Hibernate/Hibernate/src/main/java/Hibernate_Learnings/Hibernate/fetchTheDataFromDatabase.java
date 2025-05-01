package Hibernate_Learnings.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetchTheDataFromDatabase {
    public static void main(String[] args) {

        AnnotationsClasses aC = new AnnotationsClasses();
        Configuration con = new Configuration().configure().addAnnotatedClass(Aliens.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx =session.beginTransaction(); // Push all data with help of commit

        aC=session.get(AnnotationsClasses.class,1); // this means create session with class and ID (unique value)

        tx.commit();

        System.out.println(aC);
    }
}
