package com.bodu.dubbo;

import com.bodu.dubbo.xsd.DataSourceInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "xsd.xml");
    public static void main( String[] args )
    {
        DataSourceInfo d = (DataSourceInfo) context.getBean("myDataSourcce");
        System.out.println(d);
        System.out.println( "Hello World!" );
    }
}
