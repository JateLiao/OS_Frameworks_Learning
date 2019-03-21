/*
 * 文件名：CatchAspectService.java
 * 版权：Copyright 2007-2017 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CatchAspectService.java
 * 修改人：tianzhong
 * 修改时间：2017年12月7日
 * 修改内容：新增
 */
package com.lsj.os_frameworks_learning.os_frameworks.aspectj.exceptionhandle;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 * 
 * @author     tianzhong
 */
@Aspect
public class CatchAspectService {

    @Around("execution(* com.lsj..*(..))")
    public void catchMonitor(){
        
    }
}
