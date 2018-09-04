package com.ecjtu.hotel.dao;

import java.util.List;



import com.ecjtu.hotel.pojo.Manager;

public interface ManagerMapper {

	Manager getManagerByName(String mName);

	// 登陆验证
	Manager getManager(Manager manager);

	// 修改密码
	int updateManager(Manager manager);

	// 显示所有用户
	List<Manager> getManagers();

	// 查找用户
	Manager getManagerById(Integer id);

	// 删除用户
	int deleteManagerById(Integer id);
}
