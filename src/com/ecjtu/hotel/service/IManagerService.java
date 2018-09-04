package com.ecjtu.hotel.service;

import java.util.List;

import com.ecjtu.hotel.pojo.Manager;

public interface IManagerService {

	Manager getManagerByName(String mName);

	Manager getManager(Manager manager);

	int updateManager(Manager manager);

	// 显示所有用户
	List<Manager> getManagers();

	// 查找用户
	Manager getManagerById(Integer mId);

	// 删除用户
	int deleteManagerById(Integer mId);
}
