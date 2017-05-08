package com.uchoice.demo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.uchoice.demo.api.Request;
import com.uchoice.demo.api.Result;
import com.uchoice.demo.api.UchoiceUserMetaDataService;
import com.uchoice.demo.api.vo.UchoiceUserMetadata;
@Service
public class UchoiceUserMetaDataServiceDubboImpl implements
		UchoiceUserMetaDataService {
	
	public Result<Void> addUchoiceUserMetaData(
			Request<UchoiceUserMetadata> request) {
		// TODO Auto-generated method stub
		return Result.success(null);
	}

	public Result<UchoiceUserMetadata> querySingleUchoiceUserMeta(
			Request<Integer> request) {
		UchoiceUserMetadata metadata = new UchoiceUserMetadata();
		metadata.setAdress("在路上");
		metadata.setAge(18);
		metadata.setUserName("uchoice");
		metadata.setUserId(121);
		metadata.setUserSex("男");
		return Result.success(metadata);
	}

}
