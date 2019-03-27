package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/3/280:10
 */
// classpath:
//@RunWith(Runner.class)
//@ContextConfiguration("/com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context.xml")
public class AspectTest {
    @Autowired
    ServiceImpl service;
    
    @Test
    public void testLog() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:/com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context.xml");
        if (null == service) {
            //service = (ServiceImpl) context.getBean(ServiceImpl.class);
            service = new ServiceImpl();
        }
        
        System.out.println("Get a number: " + service.getNumber());
    }
}
