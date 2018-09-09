package com.example.demo.service.pby;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.pby.UserMapper;
import com.example.demo.pojo.pby.Studentexam;
import com.example.demo.pojo.pby.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	/**
	 * 查询登录的用户信息
	 * @param userId
	 * @return
	 */
	public User selectUser(String userId){
		return this.userMapper.selectUser(userId);
	}
	
	public List<Studentexam> selectStudentexamAll(String userid){
		return this.userMapper.selectStudentexamAll(userid);
	}
}
