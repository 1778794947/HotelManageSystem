package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecjtu.hotel.dao.UserMapper;
import com.ecjtu.hotel.pojo.User;
import com.ecjtu.hotel.service.IUserService;
@Service
public class UserService implements IUserService {

	@Autowired
	UserMapper usermapper;
	

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return usermapper.getUserByName(name);
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return usermapper.getUser(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return usermapper.updateUser(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return usermapper.getUsers();
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return usermapper.getUserById(id);
	}

	@Override
	public int deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		return usermapper.deleteUserById(id);
	}

	@Override
	public int registerUser(User user) {
		// TODO Auto-generated method stub
		return usermapper.registerUser(user);
	}

}
