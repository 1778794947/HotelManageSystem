package com.ecjtu.hotel.dao;

import java.util.List;


import com.ecjtu.hotel.pojo.User;

public interface UserMapper {
	User getUserByName(String name);  
	//��½��֤
	User getUser(User user);
	//�޸�����
	int updateUser(User user);
	//��ʾ�����û�
	List<User> getUsers();
	//�����û�
	User getUserById(Integer id);
	//ɾ���û�
	int deleteUserById(Integer id);
	//�û�ע��
	int registerUser(User user);
	

}
