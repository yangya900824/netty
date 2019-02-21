package com.yangya.netty;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

@Component
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
	@Resource
	private DiscardServerHandler discardServerHandler;

	public void initChannel(SocketChannel socketChannel) throws Exception {
		socketChannel.pipeline().addLast(discardServerHandler);
	}
}