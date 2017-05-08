package com.uchoice.demo.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

@Configuration
public class DubboxConfig {
	@Bean
	public ApplicationConfig applicationConfig(){
		ApplicationConfig applicationConfig = new ApplicationConfig("uchoice-demo-provider");
		return applicationConfig;
	}
	@Bean
	public RegistryConfig registryConfig(){
		RegistryConfig registryConfig = new RegistryConfig("zookeeper://115.159.121.174:2181");
		return registryConfig;
	}
	@Bean
	public static AnnotationBean annotationBean(){
		AnnotationBean annotationBean = new AnnotationBean();
		annotationBean.setPackage("com.uchoice.demo.provider");
		return annotationBean;
	}
	@Bean
	public ProtocolConfig protocolConfig(){
		ProtocolConfig protocolConfig = new ProtocolConfig("dubbo", 20880);
		protocolConfig.setSerialization("dubbo");
		return protocolConfig;
	}
}
