package com.lsj.os_frameworks_learning.os_frameworks.spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.context.support.ServletContextResource;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/3/815:25
 */
public class ApplicationContextTest {
    @Test
    public void test1() {
        ApplicationContext context;
        BeanFactory beanFactory;
        ServletContextResource resource;
        FileSystemResource systemResource;
        BeanDefinition beanDefinition;
        AbstractXmlApplicationContext abstractXmlApplicationContext;
        BeanDefinitionReader beanDefinitionReader;
        BeanDefinitionHolder beanDefinitionHolder;
    
        ConcurrentHashMap<String, String> concurrentHashMap;
        HashMap hashMap;
        FactoryBean factoryBean;
        BeanFactory beanFactory1;
    }
}
