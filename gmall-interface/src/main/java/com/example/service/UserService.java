package com.example.service;

import com.example.bean.UserAddress;
import com.example.bean.UserInfo;

import java.util.List;

public interface UserService {

	public List<UserInfo> getUserInfoList(UserInfo userInfoQuery);

	public UserInfo getUserInfo(UserInfo userInfoQuery);

	public void delete(UserInfo userInfoQuery);

	public void addUserInfo(UserInfo userInfo);

	public void updateUserInfo(UserInfo userInfo);

	public List<UserAddress> getUserAddressList(String userId);
}
