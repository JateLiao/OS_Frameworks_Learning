/*
 * 文件名：CatchTest.java
 * 版权：Copyright 2007-2017 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CatchTest.java
 * 修改人：tianzhong
 * 修改时间：2017年12月7日
 * 修改内容：新增
 */
package com.lsj.os_frameworks_learning.os_frameworks.aspectj.exceptionhandle;

import org.aspectj.lang.annotation.Aspect;

/**
 * TODO 添加类的一句话简单描述.
 * @author     tianzhong
 */
@Aspect
public class CatchTest {

    public String catchTest(){
        String res = null;
        
        try {
            res = "Hello, I'm testing aspect.";
            int i = 100 / 0;
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return res;
    }
}
