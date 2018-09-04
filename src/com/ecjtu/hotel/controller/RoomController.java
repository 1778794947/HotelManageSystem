package com.ecjtu.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecjtu.hotel.pojo.Room;
import com.ecjtu.hotel.service.IRoomService;
@Controller
public class RoomController {

	@Autowired
	private IRoomService roomService;
	
	
	@RequestMapping("/addRoom")
	@ResponseBody
	public String addRoom(@ModelAttribute Room room) {
		return roomService.addRoom(room)!=0?"ok":"error";
	}
	
	@RequestMapping("/deleteRoom")
	@ResponseBody
	public String deleteRoom(Integer id) {
		return roomService.deleteRoomById(id)!=0?"ok":"error";
	}
	
	@RequestMapping("/updateRoom")
	@ResponseBody
	public String updateRoom(@ModelAttribute Room room) {
		return roomService.updateRoomById(room)!=0?"ok":"error";
	}
	
	@RequestMapping("/listRoom")
	public String listRoom(Model model) {
		List<Room>rooms=roomService.getAllRooms();
		model.addAttribute("rooms", rooms);
		return "WEB-INF/app/showrooms";
	}
	
	@RequestMapping("/edidtRoom")
	@ResponseBody
	public Room listRoom(Model model,Integer id) {
		Room room=roomService.getRoomById(id);
		model.addAttribute("room", room);
		return room;
	}
	
}
