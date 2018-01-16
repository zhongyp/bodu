package com.bodu.dubbo.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * project: bodu-dubbo
 * author: zhongyp
 * date: 2018/1/15
 * mail: zhongyp001@163.com
 */
public class Producer {

    public static void main(String[] args) throws Exception {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-producer.xml"});
        context.start();
        // 添加监听，点击任何键，退出服务
        System.in.read(); // press any key to exit
    }

}
