package com.bodu.dubbo.xsd;

/**
 * project: bodu-dubbo
 * author: zhongyp
 * date: 2018/1/24
 * mail: zhongyp001@163.com
 */
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
public class NameSpaceHandlerSupport extends NamespaceHandlerSupport {

    @Override
    public void init()
    {
        registerBeanDefinitionParser("datasource",
                new XSDDefinitionparser());
    }
}
