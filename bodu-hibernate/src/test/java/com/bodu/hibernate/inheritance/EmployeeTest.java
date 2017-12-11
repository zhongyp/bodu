package com.bodu.hibernate.inheritance;

import com.bodu.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/11
 * mail: zhongyp001@163.com
 */
public class EmployeeTest {
    @Test
    public void testSave(){
        Session session = HibernateUtils.getCurrentSession();// 从会话工厂获取一个session
        Transaction t = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setName("Yiibai");

        Regular_Employee e2 = new Regular_Employee();
        e2.setName("Max su");
        e2.setSalary(50000);
        e2.setBonus(5);

        Contract_Employee e3 = new Contract_Employee();
        e3.setName("Hippo su");
        e3.setPay_per_hour(1000);
        e3.setContract_duration("15 hours");

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);

        t.commit();
        session.close();
        System.out.println("success");
    }
}
