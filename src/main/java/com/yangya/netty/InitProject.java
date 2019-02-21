package com.yangya.netty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitProject implements ApplicationRunner {
	@Autowired
	private DiscardServer discardServer;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		discardServer.run(8081);
	}
}
