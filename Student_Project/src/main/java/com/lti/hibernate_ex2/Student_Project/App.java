package com.lti.hibernate_ex2.Student_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Configuration configuration=new Configuration().configure();
    StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    SessionFactory factory=configuration.buildSessionFactory(builder.build());
    Session session=factory.openSession();
    Student stud=new Student();
    stud.setName("Sindhura");
    stud.setDomain("java");
   session.beginTransaction();
   session.save(stud);
   session.getTransaction().commit();
    
    }
}
