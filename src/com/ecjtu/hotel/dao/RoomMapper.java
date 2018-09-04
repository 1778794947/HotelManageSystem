package com.ecjtu.hotel.dao;

import java.util.List;

import com.ecjtu.hotel.pojo.Room;

public interface RoomMapper {
	Room getRoomById(Integer id);

	List<Room> getAllRooms();

	int updateRoomById(Room room);

	int deleteRoomById(Integer id);

	int addRoom(Room room);

	List<Room> getRoomsByStatus(Integer status);
}
