package com.lsj.os_frameworks_learning.test;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import java.io.FileNotFoundException;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.test
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/4/2021:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {
    
    //private Logger LOG = LoggerFactory.getLogger(BaseTest.class);
    
    // log4j配置
    static {
    
        try {
            Log4jConfigurer.initLogging("classpath:com/lsj/os_frameworks_learning/os_frameworks/log4j.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.ERROR);
    }
}
