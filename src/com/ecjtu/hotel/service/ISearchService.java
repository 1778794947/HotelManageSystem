package com.ecjtu.hotel.service;

import java.util.List;

import com.ecjtu.hotel.pojo.Expend;
import com.ecjtu.hotel.pojo.Guest;
import com.ecjtu.hotel.pojo.Income;
import com.ecjtu.hotel.pojo.Reserve;
import com.ecjtu.hotel.pojo.Room;
import com.ecjtu.hotel.pojo.Staff;
import com.ecjtu.hotel.pojo.User;

public interface ISearchService {
	List<User> SearchUserByName(String username);
	List<Staff> SearchStaffByName(String staffname);
	List<Room> SearchRoomByType(String roomtype);
	List<Reserve> SearchReserveByName(String reservename);
	List<Income> SearechIncomeByName(String incomename);
	List<Guest> SearchGuestByName(String guestname);
	List<Expend> SearchExpendByName(String expendname);
}
