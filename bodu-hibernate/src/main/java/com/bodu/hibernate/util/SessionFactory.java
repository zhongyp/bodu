package com.bodu.hibernate.util;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/5
 * mail: zhongyp001@163.com
 */
public class SessionFactory {

    public static Session getSession(){
        Configuration configuration = new Configuration();//创建Configuration对象
        configuration.configure();//从配置文件读取配置信息
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        org.hibernate.SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.getCurrentSession();//获取当前session
        return session;
    }

}
