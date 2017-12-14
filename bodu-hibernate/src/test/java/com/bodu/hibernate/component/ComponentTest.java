package com.bodu.hibernate.component;

import com.bodu.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/14
 * mail: zhongyp001@163.com
 */
public class ComponentTest {

    @Test
    public void testComponent(){
        Session session = HibernateUtils.getCurrentSession();// 从会话工厂获取一个session
        // creating transaction object
        Transaction t = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setName("苏小明");
        e1.setEmail("xima.su@gmail.com");

        Address address1 = new Address();
        address1.setAddressLine1("G-1621, Renmin Road");
        address1.setCity("海口");
        address1.setState("海南");
        address1.setCountry("中国");
        address1.setPincode(572201);

        e1.setAddress(address1);
        address1.setEmployee(e1);

        session.persist(e1);
        t.commit();

        session.close();
        System.out.println("success");
    }
}
