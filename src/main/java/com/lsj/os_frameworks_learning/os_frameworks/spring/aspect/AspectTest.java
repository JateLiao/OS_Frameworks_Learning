package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/3/280:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context-aspect.xml"})
@ComponentScan("com.lsj.os_frameworks_learning.os_frameworks.spring")
public class AspectTest {
    //@Resource(name = "service")
    //@Autowired
    private ServiceImpl service;
    
    @Test
    public void testLog() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context-aspect.xml");
        //context = new FileSystemXmlApplicationContext("classpath*:/com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context-quartz.xml");
        if (null == service) {
            service = (ServiceImpl) context.getBean(ServiceImpl.class);
            //service = new ServiceImpl();
        }
        
        System.out.println("Get a number: " + service.getNumber());
    }
    
    /**
     * main method.
     **/
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:/com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context-aspect.xml");
        //context = new FileSystemXmlApplicationContext("classpath*:/com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context-quartz.xml");
        ServiceImpl service = (ServiceImpl) context.getBean(ServiceImpl.class);
        System.out.println("Get a number: " + service.getNumber());
        
    }
}
