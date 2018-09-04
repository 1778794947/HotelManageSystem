package com.ecjtu.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecjtu.hotel.dao.RoomMapper;
import com.ecjtu.hotel.pojo.Room;
import com.ecjtu.hotel.service.IRoomService;
@Service
public class RoomService implements IRoomService {

	@Autowired
	RoomMapper roomMapper;

	public RoomService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Room getRoomById(Integer id) {
		// TODO Auto-generated method stub
		return roomMapper.getRoomById(id);
	}

	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return roomMapper.getAllRooms();
	}

	@Override
	public int updateRoomById(Room room) {
		// TODO Auto-generated method stub
		return roomMapper.updateRoomById(room);
	}

	@Override
	public int deleteRoomById(Integer id) {
		// TODO Auto-generated method stub
		return roomMapper.deleteRoomById(id);
	}

	@Override
	public int addRoom(Room room) {
		// TODO Auto-generated method stub
		return roomMapper.addRoom(room);
	}

	@Override
	public List<Room> getRoomsByStatus(Integer status) {
		// TODO Auto-generated method stub
		return roomMapper.getRoomsByStatus(status);
	}

}
