package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring.aspect
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/3/280:08
 */
@Component
@Aspect
public class ServiceAspect {
    @Autowired
    ServiceLog serviceLog;
    
    @Pointcut("execution(* com.lsj.os_frameworks_learning.os_frameworks.spring.aspect.ServiceImpl..*(..))")
    public void poinCut(){
    
    }
    
    @AfterReturning("")
    public void afterGetNumberLog() {
        serviceLog.log();
    }
}
