package Hibernate_Learnings.Hibernate.HQL;

import Hibernate_Learnings.Hibernate.Caching.LevelCaching;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.hibernate.transform.Transformers;

import java.util.List;
import java.util.Map;
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

        // to fetch only specified column with sepic row
        /*
        Query query = session.createQuery("select hqlNum,hqlName,hqlQuery from HQLClass where hqlNum = 105 ");
        Object[] hqlList = (Object[])query.uniqueResult();

        for(Object obj : hqlList)
            System.out.println(obj);

        System.out.println(hqlList[0]+" : "+hqlList[1]+" : "+hqlList[2]);


         */

        //To fech entire table with SQL
        /*
        Query query = session.createQuery("select hqlNum,hqlName,hqlQuery from HQLClass ");
        List<Object[]> hqlList = (List<Object[]>)query.list();

        for(Object[] obj : hqlList)
            System.out.println(obj[0]+" : "+obj[1]+" : "+obj[2]);

         */

        //To fetch data from SQL query
        /*
        SQLQuery query = session.createSQLQuery("Select * from HQLClass");
        query.addEntity(HQLClass.class);
        List<HQLClass> hqlclass = query.list();

        for(Object obj : hqlclass)
            System.out.println(obj);

         */

        // To fetch particular columns of table by SQLQuery
        /*
        SQLQuery query = session.createSQLQuery("Select hqlName,hqlQuery from HQLClass");
        query.setResultTransformer(Transformers.aliasToBean(HQLClass.class));  // deprecated in recent Hibernate versions

        List<HQLClass> hqlclassList = query.list();

        for (HQLClass obj : hqlclassList) {
            System.out.println(obj);
        }

         */

        //Another Way
        SQLQuery query1 = session.createSQLQuery("Select hqlName,hqlQuery from HQLClass");
        query1.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
        List hqlclass = query1.list();
        for(Object obj : hqlclass)
        {
            Map map = (Map) obj;
            System.out.println(map.get("hqlName") + " : " + map.get("hqlQuery"));
        }


        tx.commit();
        session.close();
    }
}

