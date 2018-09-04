package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecjtu.hotel.dao.GuestMapper;
import com.ecjtu.hotel.pojo.Guest;
import com.ecjtu.hotel.service.IGuestService;

@Service
public class GuestService implements IGuestService {

	@Autowired
	GuestMapper guestMapper;
	
	

	@Override
	public int addGuest(Guest guest) {
		
		return guestMapper.addGuest(guest);
	}

	@Override
	public int deleteGuestById(Integer id) {
		
		return guestMapper.deleteGuestById(id);
	}

	@Override
	public int updateGuest(Guest guest) {
		
		return guestMapper.updateGuest(guest);
	}


	@Override
	public List<Guest> getAllGuest() {
		
		return guestMapper.getAllGuest();
	}

	@Override
	public Guest getGuestByUserId(Integer id) {
		// TODO Auto-generated method stub
		return guestMapper.getGuestByUserId(id);
	}

}
