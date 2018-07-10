package com.yuny.myweb.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuny.myweb.model.User;

@RestController
public class AppController {
	
	@RequestMapping("/{id}") 
	public String  getUser(@PathVariable Integer id,Model model) {
		
		model.addAttribute("user",new User(id,"张三",20,"中国广州"));
		return "/user/detail";
	}
	
	@RequestMapping("/vv")
	public String  listUser(Model model) {
		
		return "vv";
	}
}
