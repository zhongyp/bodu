package com.bodu.hibernate.cache;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.*;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/6
 * mail: zhongyp001@163.com
 */

public class UserTest {

    private static SessionFactory sessionFactory = null;
    @BeforeClass
    public static void beforeClass() {
        Configuration configuration = new Configuration();
        try {
            configuration.configure();
        } catch (HibernateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
    @org.junit.Test
    public void testEhcache() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User u1 = (User) session.load(User.class, 3);
        System.out.println(u1.getName());
        session.getTransaction().commit();
        session.close();
        Session session2 = sessionFactory.openSession();

        session2.beginTransaction();
        User u2 = (User) session2.load(User.class, 3);
        System.out.println(u2.getName());
        session2.getTransaction().commit();
        session2.close();
    }
}
