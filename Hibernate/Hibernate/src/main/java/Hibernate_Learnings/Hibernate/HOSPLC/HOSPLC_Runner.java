package Hibernate_Learnings.Hibernate.HOSPLC;

import Hibernate_Learnings.Hibernate.HOSPLC.HOSPLC_Class;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Random;

public class HOSPLC_Runner {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure().addAnnotatedClass(HOSPLC_Class.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();


        //To Store Data in HQLClass Table
        Random random = new Random();
        for (int i = 202; i <= 250; i++)
        {
            HOSPLC_Class hosplcClass = new HOSPLC_Class();
            hosplcClass.setHosplcName("NAME"+i);
            hosplcClass.setHosplcNum(i);
            hosplcClass.setHoslcType("Type"+random.nextInt(i));
            session.save(hosplcClass);

        }
        tx.commit();
    }
}
