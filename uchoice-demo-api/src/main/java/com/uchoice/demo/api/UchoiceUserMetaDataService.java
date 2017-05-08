package com.uchoice.demo.api;

import com.uchoice.demo.api.vo.UchoiceUserMetadata;

/**
 * 用户元数据的service
 * @author Administrator
 *
 */
public interface UchoiceUserMetaDataService {
	/**
	 * 添加用户元数据
	 * @param request
	 * @return
	 */
	public Result<Void> addUchoiceUserMetaData(Request<UchoiceUserMetadata> request);
	/**
	 * 通过用户元数据ID查询元数据
	 * @param request
	 * @return
	 */
	public Result<UchoiceUserMetadata> querySingleUchoiceUserMeta(Request<Integer> request);
}
