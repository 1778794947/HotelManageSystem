package com.ecjtu.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecjtu.hotel.pojo.Expend;
import com.ecjtu.hotel.service.IExpendService;


@Controller
public class ExpendController {

	@Autowired
	private IExpendService expendService;

	@RequestMapping("/addExpend")
	@ResponseBody
	public String addExpend(@ModelAttribute Expend expend) {

		return expendService.addExpend(expend) != 0 ? "ok" : "error";

	}

	@RequestMapping("/deleteExpend")
	@ResponseBody
	public String deleteExpend(Integer id) {

		return expendService.deleteExpendById(id) != 0 ? "ok" : "error";

	}

	@RequestMapping("/updateExpend")
	@ResponseBody
	public String updateExpend(@ModelAttribute Expend expend) {

		return expendService.updateExpend(expend) != 0 ? "ok" : "error";

	}

	@RequestMapping("/listExpend")
	public String listExpend(Model model) {
		List<Expend> expends = expendService.getExpends();
		model.addAttribute("expends", expends);
		return "redirect:client/showexpend.jsp";
	}

	@RequestMapping("/editExpend")
	@ResponseBody
	public Expend editExpend(Model model, Integer id) {
		Expend expend = expendService.getExpendById(id);
		model.addAttribute("expend", expend);
		return expend;
	}
}
