package com.uchoice.demo.api;

import java.io.Serializable;

public class Result<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private T data;
	private boolean success;
	private int errorCode;
	private String description;
	
	public static <T>Result<T> success(T data){
		Result<T> result = new Result<T>();
		result.setData(data);
		result.setSuccess(true);
		return result;
	}
	public static <T>Result<T> fail(int errorCode,String description){
		Result<T> result = new Result<T>();
		result.setSuccess(false);
		result.setErrorCode(errorCode);
		result.setDescription(description);
		return result;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Result [data=" + data + ", success=" + success + ", errorCode="
				+ errorCode + ", description=" + description + "]";
	}
	
}
