package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecjtu.hotel.dao.StaffMapper;
import com.ecjtu.hotel.pojo.Staff;
import com.ecjtu.hotel.service.IStaffService;
@Service
public class StaffService implements IStaffService {

	@Autowired
	StaffMapper staffMapper;
	public StaffService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addStaff(Staff staff) {
		// TODO Auto-generated method stub
		return staffMapper.addStaff(staff);
	}

	@Override
	public int deleteStaffById(Integer id) {
		// TODO Auto-generated method stub
		return staffMapper.deleteStaffById(id);
	}

	@Override
	public int updateStaffById(Staff staff) {
		// TODO Auto-generated method stub
		return staffMapper.updateStaffById(staff);
	}

	@Override
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		return staffMapper.getAllStaff();
	}

	@Override
	public Staff getStaffById(Integer id) {
		// TODO Auto-generated method stub
		return staffMapper.getStaffById(id);
	}

}
