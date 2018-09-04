package com.ecjtu.hotel.controller;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ecjtu.hotel.pojo.User;
import com.ecjtu.hotel.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userservice;
	
	@RequestMapping("/userlogin")
	public String userlogin(HttpSession session,Model model,@ModelAttribute ("user") User user) {
		System.out.println("ฝ๘ศ๋มห/login");
	
		
		System.out.println(user);
		if (userservice.getUser(user)!=null) {
			
			List<User>list=userservice.getUsers();
			model.addAttribute("list", list);
			session.setAttribute("user", user);
			System.out.println("---------------"+session.getAttribute("user"));
			session.setMaxInactiveInterval(30*60);
			return "userindex";
		}else {
			return "userlogin";
		}
		
	}
	@RequestMapping("/userregister")
	public String userregister(@ModelAttribute User user) {
		if (user!=null) {
			if (userservice.registerUser(user)==1) {
				return "userlogin";
			}else {
				return "userregister";
			}
		}
		return "userregister";
		
	}
	@RequestMapping("/userloginout")
	public String loginOut(HttpSession session) {
		session.invalidate();
		return "userlogin";
	}
}
	