package com.ecjtu.hotel.service;

import java.util.List;

import com.ecjtu.hotel.pojo.Room;

public interface IRoomService {

	Room getRoomById(Integer id);

	List<Room> getAllRooms();

	int updateRoomById(Room room);

	int deleteRoomById(Integer id);

	int addRoom(Room room);

	List<Room> getRoomsByStatus(Integer status);

}
