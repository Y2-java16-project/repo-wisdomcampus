package com.example.demo.controller.pby;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.pby.Studentexam;
import com.example.demo.pojo.pby.User;
import com.example.demo.service.pby.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/selectUser")
	public User selectUser() {
//		System.out.println("123123");
		return this.userService.selectUser("10011");
	}
	
	@RequestMapping(value="/selectStudentexamAll")
	//在前端传入的是json格式而不是字符串
	//必须使用requestBody
	//我们通常使用的ajax中 用data的数据 通常会加上个 application/json
	public List<Studentexam> SelectStudentexamAll(@RequestBody Map map){
		System.out.println("123");
		System.out.println(map);
		return this.userService.selectStudentexamAll(map.get("userid")+"");
	}
}
