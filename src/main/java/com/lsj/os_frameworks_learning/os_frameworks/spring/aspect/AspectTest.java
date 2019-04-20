package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
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
@ComponentScan("com.lsj.os_frameworks_learning.os_frameworks.spring")
@SpringBootTest(classes = AspectTest.class)
public class AspectTest {
    @Resource(name = "service")
    //@Autowired
    private ServiceImpl service;
    
    @Test
    public void testLog() {
        //ApplicationContext context =
        //        //new ClassPathXmlApplicationContext("classpath*:com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context-aspect.xml");
        //        context = new ClassPathXmlApplicationContext("classpath:com/lsj/os_frameworks_learning/os_frameworks/spring/config/app-context-aspect.xml");
        //
        //if (null == service) {
        //    service = (ServiceImpl) context.getBean(ServiceImpl.class);
        //    //service = new ServiceImpl();
        //}
        
        System.out.println("Get a number: " + service.getNumber());
    }
}
