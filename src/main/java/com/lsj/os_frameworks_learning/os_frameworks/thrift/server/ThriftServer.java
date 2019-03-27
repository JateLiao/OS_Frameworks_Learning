/*
 * 文件名：ThriftServer.java
 * 版权：Copyright 2007-2017 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ThriftServer.java
 * 修改人：tianzhong
 * 修改时间：2017年3月13日
 * 修改内容：新增
 */
package com.lsj.os_frameworks_learning.os_frameworks.thrift.server;

import com.lsj.os_frameworks_learning.os_frameworks.thrift.service.IThriftTestServcie;
import com.lsj.os_frameworks_learning.os_frameworks.thrift.service.impl.ThriftTestServcieImpl;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


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
@Component("thriftServer")
public class ThriftServer {
    /**
     * 添加字段注释.
     */
    @Value("${thrift.port}")
    private static int serverPort = 9099;

    static {

        System.err.println("thrift服务器启动...");
        // 启动thrift服务
        try {
            // TProcessor processor = new IThriftTestServcie.Processor<Iface>(new ThriftTestServcieImpl());
            //
            // // 单线程
            // TServerSocket serverSocket = new TServerSocket(Integer.valueOf(serverPort));
            // TServer.Args args = new TServer.Args(serverSocket);
            // args.processor(processor);
            // args.protocolFactory(new TBinaryProtocol.Factory());
            //
            // TServer server = new TSimpleServer(args);
            // server.serve();

            TProcessor tprocessor = new IThriftTestServcie.Processor<IThriftTestServcie.Iface>(new ThriftTestServcieImpl());

            TServerSocket serverTransport = new TServerSocket(serverPort);
            TThreadPoolServer.Args ttpsArgs = new TThreadPoolServer.Args(serverTransport);
            ttpsArgs.processor(tprocessor);
            ttpsArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer server = new TThreadPoolServer(ttpsArgs);
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
