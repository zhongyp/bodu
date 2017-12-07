package com.bodu.hibernate.cache;

import com.bodu.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/6
 * mail: zhongyp001@163.com
 */
public class CacheSampleTest {


    @org.junit.Test
    public void testEcache()
    {
        Session session = HibernateUtils.getNewSession();//获取session对象
        Transaction t = session.beginTransaction();
        session.save(new CacheSample("苏小牛", 12));
        session.save(new CacheSample("库日天", 19));
        t.commit();
        Session session1 = HibernateUtils.getNewSession();//获取session对象
        Transaction t1 = session1.beginTransaction();
        CacheSample emp1 = (CacheSample) session1.load(CacheSample.class, 1);
        System.out.println(emp1.getId() + " " + emp1.getName() + " "
                + emp1.getAge());
        t1.commit();

        //再次查询ID=1的员工信息，因为使用了缓存，这里不会再发出查询语句...
        Session session11 = HibernateUtils.getNewSession();//获取session对象
        Transaction t11 = session11.beginTransaction();
        CacheSample emp11 = (CacheSample) session11.load(CacheSample.class, 1);
        System.out.println(emp11.getId() + " " + emp11.getName() + " "
                + emp11.getAge());
        t11.commit();

        Session session2 = HibernateUtils.getNewSession();//获取session对象
        Transaction t2 = session2.beginTransaction();
        CacheSample emp2 = (CacheSample) session2.load(CacheSample.class, 2);
        System.out.println(emp2.getId() + " " + emp2.getName() + " "
                + emp2.getAge());
        t2.commit();



    }
}
