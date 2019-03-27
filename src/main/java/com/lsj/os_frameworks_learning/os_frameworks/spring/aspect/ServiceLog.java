package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect;

import org.springframework.stereotype.Component;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/3/280:12
 */
@Component
public class ServiceLog {
    public void log() {
        System.out.println("我要记录日志了！！");
    }
}
