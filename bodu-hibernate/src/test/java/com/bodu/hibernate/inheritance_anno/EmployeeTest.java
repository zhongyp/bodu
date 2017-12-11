package com.bodu.hibernate.inheritance_anno;

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
    public void testEmployee(){
        Session session = HibernateUtils.getCurrentSession();// 从会话工厂获取一个session

        // creating transaction object
        Transaction t = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setName("用户名-01");

        Regular_Employee e2 = new Regular_Employee();
        e2.setName("yiibai su");
        e2.setSalary(50002);
        e2.setBonus(5);

        Contract_Employee e3 = new Contract_Employee();
        e3.setName("Mina su");
        e3.setPay_per_hour(1010);
        e3.setContract_duration("15 hours");

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);

        t.commit();
        session.close();
        System.out.println("success");
    }
}
