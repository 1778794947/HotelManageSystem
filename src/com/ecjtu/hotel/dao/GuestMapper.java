package com.ecjtu.hotel.dao;

import java.util.List;

import com.ecjtu.hotel.pojo.Guest;

public interface GuestMapper {


	int addGuest(Guest guest);

	int deleteGuestById(Integer id);

	int updateGuest(Guest guest);

	Guest getGuestByUserId(Integer id);

	List<Guest> getAllGuest();
}
