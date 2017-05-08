package com.uchoice.demo.api.vo;

import java.io.Serializable;

public class UchoiceUserMetadata implements Serializable{
	
	private static final long serialVersionUID = -5992940461225051895L;
	private int userId;
	private String userName;
	private String userSex;
	private int age;
	private String adress;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "UchoiceUserMetadata [userId=" + userId + ", userName="
				+ userName + ", userSex=" + userSex + ", age=" + age
				+ ", adress=" + adress + "]";
	}
}
