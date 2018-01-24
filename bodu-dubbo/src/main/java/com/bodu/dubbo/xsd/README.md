
# XSD 源码解析

## Quick start



## Useage

测试程序：
```
private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "xsd.xml");
public static void main( String[] args )
{
    DataSourceInfo d = (DataSourceInfo) context.getBean("myDataSourcce");
    System.out.println(d);
    System.out.println( "Hello World!" );
}
```



