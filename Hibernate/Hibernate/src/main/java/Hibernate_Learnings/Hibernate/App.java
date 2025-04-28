package Hibernate_Learnings.Hibernate;


import org.hibernate.AnnotationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      /*
        Aliens a1 =new Aliens();
       a1.setAid(102);
       a1.setAname("Udai");
       a1.setAcolor("Blue");
       */

        AnnotationsClasses aC = new AnnotationsClasses();
        aC.setAid(4);
        aC.setAname("@Transient");
        aC.setADesc("This is used to drop the table and craete new without particular column.");

       
       // Now for saving these details use session of Hibernate
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Aliens.class);
       SessionFactory sf= con.buildSessionFactory();
       Session session = sf.openSession();

        Transaction tx =session.beginTransaction(); // Push all data with help of commit

//       session.save(a1);
        session.save(aC);


       tx.commit();

    }
}
