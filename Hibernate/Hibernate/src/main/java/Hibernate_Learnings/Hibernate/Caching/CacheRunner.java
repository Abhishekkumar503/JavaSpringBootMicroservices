package Hibernate_Learnings.Hibernate.Caching;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CacheRunner {
    public static void main(String[] args) {

        // To add records into database
        /*
        LevelCaching levelCaching = new LevelCaching();
        levelCaching.setLevelNumber(104);
        levelCaching.setLevelName("Rahul");
        levelCaching.setLeveltype("LevelTwoCaching");
        */


        // Level One Caching
        LevelCaching levelCaching = null;

        Configuration con = new Configuration().configure().addAnnotatedClass(LevelCaching.class);
        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();
        levelCaching = (LevelCaching) session.get(LevelCaching.class,101);
        System.out.println(levelCaching);
        tx.commit();
        session.close();


        Session session1 = sf.openSession();
        Transaction tx1 =session1.beginTransaction();
        levelCaching = (LevelCaching) session1.get(LevelCaching.class,101);
        System.out.println(levelCaching);
        tx1.commit();
        session1.close();

//        session.save(levelCaching);
//        tx.commit();



        //Level Two Caching with query

        Session session2 = sf.openSession();  // this will create session
        Transaction tx2 =session2.beginTransaction();

        Query query = session2.createQuery("from LevelCaching levelcachi0_ where levelcachi0_.levelNumber=101");
        query.setCacheable(true);
        levelCaching = (LevelCaching) query.uniqueResult();
        System.out.println(levelCaching);

        Session session3 = sf.openSession();  // this will create session
        Transaction tx3 =session3.beginTransaction();

        Query query1 = session2.createQuery("from LevelCaching levelcachi0_ where levelcachi0_.levelNumber=101");
        query1.setCacheable(true);
        levelCaching = (LevelCaching) query1.uniqueResult();
        System.out.println(levelCaching);
        
    }
}
