package com.lsj.os_frameworks_learning.os_frameworks.spring.transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;

/**
 * @author Administrator
 * @description: ${TODO}
 * @Createtime 2019/5/2014:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan("com.lsj.os_frameworks_learning.os_frameworks.spring")
@SpringBootTest(classes = TransactionalTest.class)
public class TransactionalTest {

    TransactionInterceptor transactionInterceptor;
    AbstractPlatformTransactionManager manager;
    TransactionAttribute transactionAttribute;
    AnnotatedElementUtils annotatedElementUtils;
    
    @Test
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.MANDATORY)
    public void testTransactional() {
    
    }

}
