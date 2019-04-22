package com.lsj.os_frameworks_learning.os_frameworks.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring.springboot
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/4/2222:20
 */
@SpringBootApplication
@ComponentScan("com.lsj.os_frameworks_learning.os_frameworks.spring.springboot")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Main {
    /**
     * main method.
     **/
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
