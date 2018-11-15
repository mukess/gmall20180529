package com.example.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserInfo implements Serializable {
	@Id // 主键
	@Column // 通用mapper 标识与数据库对应字段
	private String	id;
	@Column
	private String	loginName;
	@Column
	private String	nickName;
	@Column
	private String	passwd;
	@Column
	private String	name;
	@Column
	private String	phoneNum;
	@Column
	private String	email;
	@Column
	private String	headImg;
	@Column
	private String	userLevel;
	/*
	 * 数据库没有，但是要用
	 * 
	 * @Transient private String score;
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
}
