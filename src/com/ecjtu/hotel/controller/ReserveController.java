package com.ecjtu.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ecjtu.hotel.pojo.Reserve;
import com.ecjtu.hotel.service.IReserveService;


@Controller
public class ReserveController {
	String msg =null;
	@Autowired
	private IReserveService reserveService;
	
	@RequestMapping("/addReserve")
	@ResponseBody
	public String addReservve(@ModelAttribute Reserve reserve) {
		return (reserveService.addReserve(reserve)!=0)?"ok":"error";
	}
	
	@RequestMapping("/deleteReserve")
	@ResponseBody
	public String deleteReservve(Integer id) {
		return reserveService.deleteReserveById(id)>0?"ok":"error";
	}
	@RequestMapping("/updateReserve")
	@ResponseBody
	public String updateReservve(@ModelAttribute Reserve reserve) {
	
		return (reserveService.updateReserve(reserve)!=0)?"ok":"error";
	}
	@RequestMapping("/reserveList")
	public String ReserveList(Model model) {
		List<Reserve>reserves=reserveService.getAllReserve();
		model.addAttribute("reserves", reserves);
		System.out.println(reserves);
		return "showreserves";
	}
	//响应页面点击修改的
    @RequestMapping("/editReserve")
	@ResponseBody
	public Reserve getUserById(Integer id,Model model) {
		Reserve reserve=reserveService.getReserveById(id);
		//需要保存id,如若不保存，Id为null
		model.addAttribute("id", id);
		System.out.println("需要修改的预定信息！！！"+reserve);
		return reserve;
	}
}
