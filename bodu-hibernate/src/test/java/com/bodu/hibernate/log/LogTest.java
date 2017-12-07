package com.bodu.hibernate.log;

import org.apache.log4j.Logger;
import org.junit.*;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/6
 * mail: zhongyp001@163.com
 */
public class LogTest {
    @org.junit.Test
    public void testLog(){
        Logger logger = Logger.getLogger(Test.class);
        logger.info("开始了");
    }
}
