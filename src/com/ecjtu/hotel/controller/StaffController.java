package com.ecjtu.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecjtu.hotel.pojo.Staff;
import com.ecjtu.hotel.service.IStaffService;
@Controller
public class StaffController {
	
	@Autowired
	private IStaffService staffService;
	
	@RequestMapping("/addStaff")
	@ResponseBody
	public String addStaff(@ModelAttribute Staff staff) {
		return staffService.addStaff(staff)!=0?"ok":"error";
	}
	
	
	@RequestMapping("/deleteStaff")
	@ResponseBody
	public String deleteStaff(Integer id) {
		return staffService.deleteStaffById(id)!=0?"ok":"error";
	}
	
	@RequestMapping("/updateStaff")
	@ResponseBody
	public String updateStaff(@ModelAttribute Staff staff) {
		return staffService.updateStaffById(staff)!=0?"ok":"error";
	}
	
	@RequestMapping("/listStaff")
	public String listStaff(Model model) {
		List<Staff>staffs=staffService.getAllStaff();
		model.addAttribute("staffs", staffs);
		return "redirect:client/showstaff.jsp";
	}
	
	@RequestMapping("/editStaff")
	@ResponseBody
	public Staff editStaff(Model model,Integer id) {
		Staff staff=staffService.getStaffById(id);
		model.addAttribute("staff", staff);
		return staff;
	}
	
	
}
