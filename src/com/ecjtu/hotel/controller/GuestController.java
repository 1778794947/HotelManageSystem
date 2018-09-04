package com.ecjtu.hotel.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecjtu.hotel.pojo.Guest;
import com.ecjtu.hotel.service.IGuestService;


@Controller
public class GuestController {

	@Autowired
	private IGuestService guestService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true)); // true:允许输入空值，false:不能为空值
	}

	@RequestMapping("/addGuest")
	@ResponseBody
	public String addGuest(@ModelAttribute Guest guest) {
		return (guestService.addGuest(guest) != 0) ? "ok" : "error";
	}

	@RequestMapping("/deleteGuest")
	@ResponseBody
	public String deleteGuest(Integer id) {
		return (guestService.deleteGuestById(id) != 0) ? "ok" : "error";
	}

	@RequestMapping("/updateGuest")
	@ResponseBody
	public String updateGuest(@ModelAttribute Guest guest) {
		return (guestService.updateGuest(guest) != 0) ? "ok" : "error";
	}

	@RequestMapping("/listGuest")
	public String listGuest(Model model) {
		List<Guest> guests = guestService.getAllGuest();
		model.addAttribute("guests", guests);
		return "showguest";
	}

	@RequestMapping("/editGuest")
	@ResponseBody
	public Guest editGuest(Model model, Integer id) {
		Guest guest = guestService.getGuestByUserId(id);
		model.addAttribute("guest", guest);
		return guest;
	}

}
