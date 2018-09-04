package com.ecjtu.hotel.dao;

import java.util.List;



import com.ecjtu.hotel.pojo.Manager;

public interface ManagerMapper {

	Manager getManagerByName(String mName);

	// ��½��֤
	Manager getManager(Manager manager);

	// �޸�����
	int updateManager(Manager manager);

	// ��ʾ�����û�
	List<Manager> getManagers();

	// �����û�
	Manager getManagerById(Integer id);

	// ɾ���û�
	int deleteManagerById(Integer id);
}
