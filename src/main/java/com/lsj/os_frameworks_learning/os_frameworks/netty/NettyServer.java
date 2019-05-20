package com.lsj.os_frameworks_learning.os_frameworks.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

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
        ServerBootstrap serverBootstrap = new ServerBootstrap();
    
        NioEventLoopGroup server = new NioEventLoopGroup();
        NioEventLoopGroup client = new NioEventLoopGroup();
        
        serverBootstrap
                .localAddress(8000)
                .group(server, client)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new StringDecoder());
                        ch.pipeline().addLast(new SimpleChannelInboundHandler() {
                            //@Override
                            protected void channelRead0(ChannelHandlerContext ctx, String msg) {
                                System.out.println(msg);
                            }
    
                            @Override
                            protected void messageReceived(ChannelHandlerContext ctx, Object msg) throws Exception {
        
                            }
                        });
                    }
                })
                .bind();
    }
}
