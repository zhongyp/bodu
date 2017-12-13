package com.bodu.hibernate.collection;

import com.bodu.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/13
 * mail: zhongyp001@163.com
 */
public class QuestionTest {
    @Test
    public void testQuestion(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction t = session.beginTransaction();
        Anwser anwser = new Anwser();
        anwser.setAnswer("I am fine");
        Anwser anwser1 = new Anwser();
        anwser1.setAnswer("thanks");
        List list = new ArrayList();
        list.add(anwser);
        list.add(anwser1);
        Question question = new Question();
        question.setAnswers(list);
        question.setQname("Are you ok?");
        session.persist(question);
        t.commit();
        session.close();
        System.out.println("成功");
    }
    @Test
    public void testHQL(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query=session.createQuery("select e from Question e");
        List<Question> list=query.list();

        Iterator<Question> itr=list.iterator();
        while(itr.hasNext()){
            Question q=itr.next();
            System.out.println("Question Name: "+q.getQname());

            //printing answers
            List<Anwser> list2=q.getAnswers();
            Iterator<Anwser> itr2=list2.iterator();
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }

        }
        transaction.commit();
        session.close();
        System.out.println("success");
    }
}
