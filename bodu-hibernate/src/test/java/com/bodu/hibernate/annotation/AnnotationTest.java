package com.bodu.hibernate.annotation;

import com.bodu.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/6
 * mail: zhongyp001@163.com
 */
public class AnnotationTest {

    @org.junit.Test
    public void testAnnotation(){
        Session session = HibernateUtils.getCurrentSession();//获取session对象
        Transaction t = session.beginTransaction();
        Annotation annotation = new Annotation();
        annotation.setId(8228);
        annotation.setFirstName("a");
        annotation.setLastName("b");
        session.persist(annotation);
        t.commit();
    }
}
