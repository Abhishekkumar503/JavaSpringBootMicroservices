package Hibernate_Learnings.Hibernate.JPA;

import Hibernate_Learnings.Hibernate.JPA.JPAClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import java.util.Random;


public class JPARunner {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure().addAnnotatedClass(JPAClass.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();

        /*
        Random random = new Random();
        for (int i = 101; i <= 150; i++)
        {
            JPAClass jpaClass = new JPAClass();
            jpaClass.setJpaname("NAME"+i);
            jpaClass.setJpaNum(i);
            jpaClass.setJpaColor("Color"+random.nextInt(i));
            session.save(jpaClass);
        }

         */

       EntityManagerFactory  emf = Persistence.createEntityManagerFactory("jpa_unit");
       EntityManager em = emf.createEntityManager();
        JPAClass jpaClass = em.find(JPAClass.class,101);
        System.out.println(jpaClass);
        tx.commit();
    }
}
