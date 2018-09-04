package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecjtu.hotel.dao.SearchMapper;
import com.ecjtu.hotel.pojo.Expend;
import com.ecjtu.hotel.pojo.Guest;
import com.ecjtu.hotel.pojo.Income;
import com.ecjtu.hotel.pojo.Reserve;
import com.ecjtu.hotel.pojo.Room;
import com.ecjtu.hotel.pojo.Staff;
import com.ecjtu.hotel.pojo.User;
import com.ecjtu.hotel.service.ISearchService;
@Service
public class SearchService implements ISearchService {

	@Autowired
	SearchMapper searchMapper;

	@Override
	public List<User> SearchUserByName(String username) {
		// TODO Auto-generated method stub
		return searchMapper.SearchUserByName(username);
	}

	@Override
	public List<Staff> SearchStaffByName(String staffname) {
		// TODO Auto-generated method stub
		return searchMapper.SearchStaffByName(staffname);
	}

	@Override
	public List<Room> SearchRoomByType(String roomtype) {
		// TODO Auto-generated method stub
		return searchMapper.SearchRoomByType(roomtype);
	}

	@Override
	public List<Reserve> SearchReserveByName(String reservename) {
		// TODO Auto-generated method stub
		return searchMapper.SearchReserveByName(reservename);
	}

	@Override
	public List<Income> SearechIncomeByName(String incomename) {
		// TODO Auto-generated method stub
		return searchMapper.SearechIncomeByName(incomename);
	}

	@Override
	public List<Guest> SearchGuestByName(String guestname) {
		// TODO Auto-generated method stub
		return searchMapper.SearchGuestByName(guestname);
	}

	@Override
	public List<Expend> SearchExpendByName(String expendname) {
		// TODO Auto-generated method stub
		return searchMapper.SearchExpendByName(expendname);
	}
	

}
