package com.mc.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class McConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McConfigServerApplication.class, args);
	}

}
