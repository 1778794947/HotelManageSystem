package com.ecjtu.hotel.service;

import java.util.List;



import com.ecjtu.hotel.pojo.User;

public interface IUserService {
	
	User getUserByName(String name);  
	//登陆验证
	User getUser(User user);
	//修改密码
	int updateUser(User user);
	//显示所有用户
	List<User> getUsers();
	//查找用户
	User getUserById(Integer id);
	//删除用户
	int deleteUserById(Integer id);
	//用户注册
	int registerUser(User user);
	

}
