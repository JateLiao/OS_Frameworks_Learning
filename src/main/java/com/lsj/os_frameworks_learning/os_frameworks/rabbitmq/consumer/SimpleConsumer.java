/*
 * 文件名：SimpleConsumer.java
 * 版权：Copyright 2007-2017 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： SimpleConsumer.java
 * 修改人：tianzhong
 * 修改时间：2017年8月18日
 * 修改内容：新增
 */
package com.lsj.os_frameworks_learning.os_frameworks.rabbitmq.consumer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;

/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * <pre>
 * </pre>
 * 
 * @author tianzhong
 */
public class SimpleConsumer extends DefaultConsumer/* implements Consumer */ {
    /**
     * 构造函数.
     * 
     * @param channel
     */
    public SimpleConsumer(Channel channel) {
        super(channel);
    }
}
