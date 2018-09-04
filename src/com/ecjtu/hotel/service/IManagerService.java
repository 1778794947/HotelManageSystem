package com.ecjtu.hotel.service;

import java.util.List;

import com.ecjtu.hotel.pojo.Manager;

public interface IManagerService {

	Manager getManagerByName(String mName);

	Manager getManager(Manager manager);

	int updateManager(Manager manager);

	// ��ʾ�����û�
	List<Manager> getManagers();

	// �����û�
	Manager getManagerById(Integer mId);

	// ɾ���û�
	int deleteManagerById(Integer mId);
}
