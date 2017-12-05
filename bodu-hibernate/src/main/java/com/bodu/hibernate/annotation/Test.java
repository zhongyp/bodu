package com.bodu.hibernate.annotation;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/5
 * mail: zhongyp001@163.com
 */
public class Test {
    public static void main( String[] args )
    {
        Session session = com.bodu.hibernate.util.SessionFactory.getSession();//获取session对象
        Transaction t = session.beginTransaction();
        System.out.println("annotation -- start");
        Annotation annotation = new Annotation();
        annotation.setId(8238);
        annotation.setFirstName("a");
        annotation.setLastName("b");
        session.persist(annotation);
        System.out.println("annotation -- end");
        t.commit();

    }
}
