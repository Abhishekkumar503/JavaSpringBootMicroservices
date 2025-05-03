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


       /* AnnotationsClasses aC = new AnnotationsClasses();
        aC.setAid(4);
        aC.setAname("@Transient");
        aC.setADesc("This is used to drop the table and craete new without particular column.");
         */

        EmbededableObject eO = new EmbededableObject();
        eO.setfName("Abis");
        eO.setmName("K");
        eO.setlName("V");

        AliensV2 aV2 = new AliensV2();
        aV2.setAid(10);
        aV2.setAname(eO);
        aV2.setAcolor("Black");

        /*
        Hibernate: create table AliensV2 (aid integer not null, acolor varchar(255), fName varchar(255), lName varchar(255), mName varchar(255), primary key (aid)) engine=InnoDB
Hibernate: insert into AliensV2 (acolor,fName,lName,mName,aid) values (?,?,?,?,?)

         */


       // Now for saving these details use session of Hibernate
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Aliens.class);
       SessionFactory sf= con.buildSessionFactory();
       Session session = sf.openSession();

       Transaction tx =session.beginTransaction(); // Push all data with help of commit

//       session.save(a1);
//       session.save(aC);

        session.save(aV2);


       tx.commit();

    }
}
