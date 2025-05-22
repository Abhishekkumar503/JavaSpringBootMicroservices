package Hibernate_Learnings.Hibernate.HQL;

import Hibernate_Learnings.Hibernate.Caching.LevelCaching;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Random;

public class HQLRunner {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure().addAnnotatedClass(HQLClass.class);
        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();

        //To Store Data in HQLClass Table
        /*
        Random random = new Random();
        for (int i = 101; i<=150; i++)
        {
            HQLClass hqlClass = new HQLClass();
            hqlClass.setHqlNum(i);
            hqlClass.setHqlName("NAME"+i);
            hqlClass.setHqlQuery("Query"+random.nextInt(i));
            session.save(hqlClass);
        }

         */

        //To fetch entire table
        /*
        Query query = session.createQuery("from HQLClass");
        List<HQLClass> hqlList = query.list();

        for(HQLClass list : hqlList)
            System.out.println(list);

         */

        

        tx.commit();
        session.close();
    }
}

