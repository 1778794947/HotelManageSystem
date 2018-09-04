package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecjtu.hotel.dao.ManagerMapper;
import com.ecjtu.hotel.pojo.Manager;
import com.ecjtu.hotel.service.IManagerService;
@Service
public class ManagerService implements IManagerService {
	
	@Autowired
	ManagerMapper managerMapper;
	
	

	@Override
	public Manager getManagerByName(String mName) {
		
		return managerMapper.getManagerByName(mName);
	}

	public ManagerService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Manager getManager(Manager manager) {
	
		return managerMapper.getManager(manager);
	}

	@Override
	public int updateManager(Manager manager) {
		
		return managerMapper.updateManager(manager);
	}

	@Override
	public List<Manager> getManagers() {
		// TODO Auto-generated method stub
		return managerMapper.getManagers();
	}

	@Override
	public Manager getManagerById(Integer mId) {
		// TODO Auto-generated method stub
		return managerMapper.getManagerById(mId);
	}

	@Override
	public int deleteManagerById(Integer mId) {
		// TODO Auto-generated method stub
		return managerMapper.deleteManagerById(mId);
	}

}
