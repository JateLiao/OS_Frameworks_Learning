package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/3/280:06
 */
@Component("service")
public class ServiceImpl {
    
    public int getNumber() {
        return new Random().nextInt(10) + 1;
    }
}
