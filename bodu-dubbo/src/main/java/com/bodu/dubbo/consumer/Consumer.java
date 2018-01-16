package com.bodu.dubbo.consumer;

/**
 * project: bodu-dubbo
 * author: zhongyp
 * date: 2018/1/15
 * mail: zhongyp001@163.com
 */
import com.bodu.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        // 防止取到IPV6的地址，这种方式仅适用于debug模式，但是你可以直接使用-Djava.net.preferIPv4Stack=true，这样不管是否是debug模式，运行都不会有问题
        System.setProperty("java.net.preferIPv4Stack", "true");
        // 获取配置文件初始化xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consuner.xml"});
        context.start();
        // 获取远程服务代理
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy
        // 循环访问远程代理服务
        while (true) {
            try {
                Thread.sleep(1000);
                String hello = demoService.sayHello("world"); // call remote method
                System.out.println(hello); // get result

            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }

    }
}