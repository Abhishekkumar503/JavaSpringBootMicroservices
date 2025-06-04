package com.maven.maven.springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;




public class App 
{
    public static void main( String[] args )
    {
//    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Spring.xml"));
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); 
    	
    	
//    	Peoples ppl = (Peoples) factory.getBean("Peoples");
    	
    	Peoples ppl = (Peoples) context.getBean("Peoples");
    	ppl.setPoints(100);
    	System.out.println(ppl.getPoints());
    	ppl.Code();
    	
    	Peoples pp2 = (Peoples) context.getBean("Peoples");
    	System.out.println(pp2.getPoints());
    	pp2.Code();
    }
}

