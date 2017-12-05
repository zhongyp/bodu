package com.bodu.hibernate.introduction;

import com.bodu.hibernate.annotation.Annotation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

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
        System.out.println( "introduction -- start" );
        Demo e1 = new Demo();//实例化对象
        e1.setId(2);
        e1.setFirstName("Max");
        e1.setLastName("Su");
        session.persist(e1);//持久化对象
        System.out.println("introduction -- end");
        t.commit();
    }
}
