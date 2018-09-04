package com.ecjtu.hotel.service;

import java.util.List;

import com.ecjtu.hotel.pojo.Guest;

public interface IGuestService {

	int addGuest(Guest guest);

	int deleteGuestById(Integer id);

	int updateGuest(Guest guest);

	Guest getGuestByUserId(Integer id);

	List<Guest> getAllGuest();

}
