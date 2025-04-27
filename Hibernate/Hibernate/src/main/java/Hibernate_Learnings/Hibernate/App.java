package Hibernate_Learnings.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Aliens a1 =new Aliens();
       a1.setAid(101);
       a1.setAname("Abhishek");
       a1.setAcolor("fair");
       
       // Now for saving these details use session of Hibernate
       
       Configuration con = new Configuration();
       SessionFactory sf= con.buildSessionFactory();
       Session session = sf.openSession();
       session.save(a1);
       
    }
}
