package com.yangya;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yangya.netty.DiscardServer;

@SpringBootApplication
public class NettyApp{
	@Resource
	private DiscardServer discardServer;

	public static void main(String[] args) {
		SpringApplication.run(NettyApp.class, args);
	}
}
