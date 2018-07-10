package com.yuny.myweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuny.myweb.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/{id}") 
	public String  getUser(@PathVariable Integer id,Model model) {
		
		model.addAttribute("user",new User(id,"张三",20,"中国广州"));
		return "/user/detail";
	}

	@RequestMapping("/list")
	public String  listUser() {
		List<User> userList = new ArrayList<User>();
		for (int i = 0; i <10; i++) {
			userList.add(new User(i,"张三"+i,20+i,"中国广州"));
		}
		
		return "vvv";
	}
}
