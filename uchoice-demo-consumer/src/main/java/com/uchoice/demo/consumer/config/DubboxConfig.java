package com.uchoice.demo.consumer.config;

import java.util.Properties;

public class DubboxConfig {
	public static Properties properties(){
		Properties properties = new Properties();
		//server port
		properties.put("server.port", 8081);
		//dubbo config
		
		properties.put("spring.dubbo.application.name", "uchoice-dubbox-consumer");
		properties.put("spring.dubbo.registry.address", "zookeeper://115.159.121.174:2181");
		properties.put("spring.dubbo.scan", "com.uchoice.demo.consumer.service");
		return properties;
	}
}
