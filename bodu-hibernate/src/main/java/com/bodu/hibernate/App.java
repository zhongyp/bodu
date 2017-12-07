package com.bodu.hibernate;

import com.bodu.hibernate.annotation.Annotation;
import com.bodu.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtils.getNewSession();//获取session对象
        Transaction t = session.beginTransaction();
        System.out.println("annotation -- start");
        Annotation annotation = new Annotation();
        annotation.setId(8238);
        annotation.setFirstName("a");
        annotation.setLastName("b");
        session.persist(annotation);
        System.out.println("annotation -- end");
        t.commit();
        System.out.print("Hello World");
    }
}
