package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Project........");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
       // System.out.println(factory);
        
        //creating student
        Student  student=new Student();
        student.setId(12);
        student.setName("Ram");
        student.setCity("noida");
        
        Session session=factory.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        
        session.save(student);
        
        transaction.commit();
        session.close();
    }
}
