package com.bodu.hibernate.log;


import com.bodu.hibernate.annotation.Annotation;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/5
 * mail: zhongyp001@163.com
 */
public class Test {
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger(Test.class);
        logger.info("开始了");
    }
}
