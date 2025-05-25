package Hibernate_Learnings.Hibernate.GET_VS_LOAD;

import Hibernate_Learnings.Hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Random;

public class GetVsLoadRunner {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure().addAnnotatedClass(GetVsLoadClass.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();

        /*
        Random random = new Random();
        for (int i = 101; i <= 150; i++)
        {
            GetVsLoadClass getVsLoadClass = new GetVsLoadClass();
            getVsLoadClass.setGetVsLoadName("NAME"+i);
            getVsLoadClass.setGetVsLoadNum(i);
            getVsLoadClass.setGetVsLoadType("Type"+random.nextInt(i));
            session.save(getVsLoadClass);
        }

         */
        System.out.println(session.load(GetVsLoadClass.class,106));
        System.out.println(session.get(GetVsLoadClass.class,107));

        tx.commit();

    }
}
