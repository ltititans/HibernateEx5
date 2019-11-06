package com.lti.hibernate_ex.hibernate_Proj;

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
    StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
    SessionFactory factory=configuration.buildSessionFactory(builder.build());
    Session session=factory.openSession();
    Employee employee=new Employee();
    employee.setEmpName("Sindhura");
   employee.setBranch("Mumbai");
   session.beginTransaction();
   session.save(employee);
   session.getTransaction().commit();
    
    }
}
