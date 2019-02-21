package com.yangya.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NettyController {

	@GetMapping("/send")
	public String send(){
		try {
			Socket socket = new Socket("localhost", 8081);
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream);
			printWriter.write("$tmb00035ET3318/08/22 11:5804029.94,027.25,20.00,20.00$");
			printWriter.flush();
			socket.shutdownOutput();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "发送成功";
	}
}
