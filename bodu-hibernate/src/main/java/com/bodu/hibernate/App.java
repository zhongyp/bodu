package com.bodu.hibernate;

import com.bodu.hibernate.cache.CacheSample;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Configuration configuration = new Configuration();//创建Configuration对象
        configuration.configure();//从配置文件读取配置信息
        SessionFactory sessionFactory = configuration.buildSessionFactory();//创建session工厂
        Session session = sessionFactory.openSession();//创建session对象
        Transaction t = session.beginTransaction();//开启事务
//
//        System.out.println( "introduction -- start" );
//        Demo e1 = new Demo();//实例化对象
//        e1.setId(100);
//        e1.setFirstName("Max");
//        e1.setLastName("Su");
//        session.persist(e1);//持久化对象
//        System.out.println("introduction -- end");
//
//        System.out.println("annotation -- start");
//        Annotation annotation = new Annotation();
//        annotation.setId(92);
//        annotation.setFirstName("a");
//        annotation.setLastName("b");
//        session.persist(annotation);
//        System.out.println("annotation -- end");

        System.out.println("cache -- start");

        Statistics stats = sessionFactory.getStatistics();//获取统计对象
        System.out.println("Stats enabled="+stats.isStatisticsEnabled());

        stats.setStatisticsEnabled(true);//开启统计信息，默认是关闭的
        System.out.println("Stats enabled="+stats.isStatisticsEnabled());

        session.save(new CacheSample("ss", 120));
//        session.save(new CacheSample("aa", 190));

        session.close();//关闭session
        Session session1 = sessionFactory.openSession();
        Transaction t1 = session1.beginTransaction();
        CacheSample emp1 = (CacheSample) session1.load(CacheSample.class, 1);
        System.out.println(emp1.getId() + " " + emp1.getName() + " "
                + emp1.getAge());
        session1.close();

//        //再次查询ID=1的员工信息，因为使用了缓存，这里不会再发出查询语句...
//        Session session11 = sessionFactory.openSession();
//        CacheSample emp11 = (CacheSample) session11.load(CacheSample.class, 1);
//        System.out.println(emp11.getId() + " " + emp11.getName() + " "
//                + emp11.getAge());
//        session11.close();


//        Session session2 = sessionFactory.openSession();
//        CacheSample emp2 = (CacheSample) session2.load(CacheSample.class, 2);
//        System.out.println(emp2.getId() + " " + emp2.getName() + " "
//                + emp2.getAge());
//        session2.close();
//        System.out.println("cache -- end");

        t.commit();//提交事务
        sessionFactory.close();//关闭session工厂
    }
}
