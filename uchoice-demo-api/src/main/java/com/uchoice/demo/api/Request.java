package com.uchoice.demo.api;

import java.io.Serializable;

public class Request<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private T data;
	
	public static <T>Request<T> create(){
		return new Request<T>();
	}
	public static <T>Request<T> create(T data){
		Request<T> request = new Request<T>();
		request.setData(data);
		return request;
	}
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
