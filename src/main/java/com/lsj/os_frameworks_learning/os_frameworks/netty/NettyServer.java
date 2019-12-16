package com.lsj.os_frameworks_learning.os_frameworks.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

/**
 * @author Administrator
 * @description: ${TODO}
 * @Createtime 2019/5/2017:36
 */
public class NettyServer {
    /**
     * main method.
     **/
    public static void main(String[] args) {
        //ServerBootstrap serverBootstrap = new ServerBootstrap();
        //
        //NioEventLoopGroup server = new NioEventLoopGroup();
        //NioEventLoopGroup client = new NioEventLoopGroup();
        //
        //serverBootstrap
        //        .group(server, client)
        //        .channel(NioServerSocketChannel.class)
        //        .childHandler(new ChannelInitializer<NioSocketChannel>() {
        //            @Override
        //            protected void initChannel(NioSocketChannel ch) throws Exception {
        //                ch.pipeline().addLast(new StringDecoder());
        //                ch.pipeline().addLast(new SimpleChannelInboundHandler() {
        //                    //@Override
        //                    protected void channelRead0(ChannelHandlerContext ctx, String msg) {
        //                        System.out.println(msg);
        //                    }
        //
        //                    @Override
        //                    protected void messageReceived(ChannelHandlerContext ctx, Object msg) throws Exception {
        //
        //                    }
        //                });
        //            }
        //        })
        //        .bind(8000);
        
        NioEventLoopGroup boosGroup = new NioEventLoopGroup();
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();
        
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap
                .group(boosGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    protected void initChannel(NioSocketChannel ch) {
                        System.out.println("childHandler-服务端已启动...");
                    }
                });
        
        serverBootstrap
                .bind(8000)
                .addListener((future) -> {
                    if (future.isSuccess()) {
                        System.out.println("端口绑定成功!");
                    } else {
                        System.err.println("端口绑定失败!");
                    }
                });
        
        serverBootstrap
                .handler(new ChannelInitializer<NioServerSocketChannel>() {
                    protected void initChannel(NioServerSocketChannel ch) {
                        System.out.println("handler-服务端启动中...");
                    }
                });
        
        serverBootstrap
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.TCP_NODELAY, true)
                .option(ChannelOption.SO_BACKLOG, 1024);
    
        
        System.out.println();
    }
}
