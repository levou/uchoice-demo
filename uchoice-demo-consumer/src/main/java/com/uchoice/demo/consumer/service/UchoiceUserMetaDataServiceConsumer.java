package com.uchoice.demo.consumer.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.uchoice.demo.api.Request;
import com.uchoice.demo.api.Result;
import com.uchoice.demo.api.UchoiceUserMetaDataService;
import com.uchoice.demo.api.vo.UchoiceUserMetadata;
@Service
public class UchoiceUserMetaDataServiceConsumer{
	
	@Reference
	private UchoiceUserMetaDataService uchoiceUserMetaDataService;
	
	public Result<Void> addUchoiceUserMetaData(
			Request<UchoiceUserMetadata> request) {
		return uchoiceUserMetaDataService.addUchoiceUserMetaData(request);
	}

	public Result<UchoiceUserMetadata> querySingleUchoiceUserMeta(
			Request<Integer> request) {
		return uchoiceUserMetaDataService.querySingleUchoiceUserMeta(request);
	}

}
