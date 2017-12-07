package com.bodu.hibernate.introduction;

import com.bodu.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/6
 * mail: zhongyp001@163.com
 */
public class DemoTest
{
    @org.junit.Test
    public void testDemo(){
        Session session = HibernateUtils.getNewSession();//获取session对象
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
