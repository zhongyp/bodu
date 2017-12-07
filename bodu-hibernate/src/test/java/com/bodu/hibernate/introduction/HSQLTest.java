package com.bodu.hibernate.introduction;

import com.bodu.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.junit.Test;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/6
 * mail: zhongyp001@163.com
 */
public class HSQLTest {

    @Test
    public void testHSQL(){

        Session session = HibernateUtils.getNewSession();//获取session对象
//
//        try {
//
//            // All the action with DB via Hibernate
//            // must be located in one transaction.
//            // Start Transaction.
//            session.getTransaction().begin();
//
//            // Create an HQL statement, query the object.
//            // Equivalent to the SQL statement:
//            // Select e.* from EMPLOYEE e order by e.EMP_NAME, e.EMP_NO
//            String sql = "Select e from " + Employee.class.getName() + " e "
//                    + " order by e.empName, e.empNo ";
//
//
//            // Create Query object.
//            Query<Employee> query = session.createQuery(sql);
//
//
//            // Execute query.
//            List<Employee> employees = query.getResultList();
//
//            for (Employee emp : employees) {
//                System.out.println("Emp: " + emp.getEmpNo() + " : "
//                        + emp.getEmpName());
//            }
//
//            // Commit data.
//            session.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            // Rollback in case of an error occurred.
//            session.getTransaction().rollback();
//        }
    }
}
