package com.ecjtu.hotel.dao;

import java.util.List;

import com.ecjtu.hotel.pojo.Staff;

public interface StaffMapper {

	int addStaff(Staff staff);

	int deleteStaffById(Integer id);

	int updateStaffById(Staff staff);

	List<Staff> getAllStaff();

	Staff getStaffById(Integer id);

}
