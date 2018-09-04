package com.ecjtu.hotel.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ecjtu.hotel.pojo.Manager;
import com.ecjtu.hotel.service.IManagerService;
import com.ecjtu.hotel.service.impl.ManagerService;





@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerService;
	
	
	
	@RequestMapping("/")
	public String enter() {
		return "WEB-INF/app/managerlogin";
	}
	@RequestMapping("/managerlogin")
	public String login(HttpSession session,Model model,@ModelAttribute Manager manager) {
		System.out.println("进入了/login");
	
		
		System.out.println(manager);
		if (managerService.getManager(manager)!=null) {
			
			List<Manager>list=managerService.getManagers();
			model.addAttribute("list", list);
			session.setAttribute("manager", manager);
			session.setMaxInactiveInterval(30*60);
			return "WEB-INF/app/managerindex";
		}else {
			return "WEB-INF/app/managerlogin";
		}
		
	}
	@RequestMapping("/editmanager")
	@ResponseBody
	public Manager getManagerById(Integer mId,Model model) {
		System.out.println("进入editmanager");
		Manager manager=managerService.getManagerById(mId);
		//需要保存id,如若不保存，Id为null
		model.addAttribute("mId", mId);
		System.out.println("需要修改的用户！！！"+manager);
		return manager;
	}
	@RequestMapping("/updatemanager")
	@ResponseBody
	public String updatemanager(@ModelAttribute Manager manager){
		return managerService.updateManager(manager)>0?"ok":"error";
	}
	//响应页面的删除
    @RequestMapping("/deletemanager")
	@ResponseBody
	public String deleteManagerById(Integer mId) {
		
    	return managerService.deleteManagerById(mId)>0?"ok":"error";
		
	}
	
	@RequestMapping("/loginout")
	public String loginOut(HttpSession session,HttpServletRequest request,HttpServletResponse response) {
		session.invalidate();
		return "WEB-INF/app/managerlogin";
	}
	@RequestMapping("/reserve")
	
	public String reserve(HttpSession session,HttpServletRequest request,HttpServletResponse response) {
		
		return "WEB-INF/app/reserve";
	}
	@RequestMapping("/reserveProcess")
	public String reserveProcess(HttpSession session,HttpServletRequest request,HttpServletResponse response) {
		
		return "WEB-INF/app/reserve";
	}
	
}
