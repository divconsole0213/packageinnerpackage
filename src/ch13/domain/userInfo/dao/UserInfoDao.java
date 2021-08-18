package ch13.domain.userInfo.dao;

import ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {

	public void insertUserInfo(UserInfo userInfo);
    public void updateUserInfo(UserInfo userInfo);
	public void deleteUserInfo(UserInfo userInfo);
}
