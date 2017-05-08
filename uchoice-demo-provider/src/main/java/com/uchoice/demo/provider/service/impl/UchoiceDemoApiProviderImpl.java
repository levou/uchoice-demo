package com.uchoice.demo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.uchoice.demo.provider.api.UchoiceDemoApi;

@Service
public class UchoiceDemoApiProviderImpl implements UchoiceDemoApi {

	public String sayHello(String input) {
		return "your input :" + input;
	}

}
