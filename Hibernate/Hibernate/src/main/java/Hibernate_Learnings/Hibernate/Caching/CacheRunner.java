package Hibernate_Learnings.Hibernate.Caching;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CacheRunner {
    public static void main(String[] args) {

        LevelCaching levelCaching = new LevelCaching();
        levelCaching.setLevelNumber(102);
        levelCaching.setLevelName("Udai");
        levelCaching.setLeveltype("LevelOneCaching");

        Configuration con = new Configuration().configure().addAnnotatedClass(LevelCaching.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx =session.beginTransaction();

        session.save(levelCaching);
        tx.commit();
    }
}
