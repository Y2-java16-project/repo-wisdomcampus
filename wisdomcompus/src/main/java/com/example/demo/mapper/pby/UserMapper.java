package com.example.demo.mapper.pby;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.pby.Studentexam;
import com.example.demo.pojo.pby.User;

public interface UserMapper {
	/**
	 * 查询登录的用户信息
	 * @param userId
	 * @return
	 */
	User selectUser(@Param("userId")String userId);
	
	/*
	 * 查询当前学生最近的考试情况 前十场
	 */
	List<Studentexam> selectStudentexamAll(@Param("userId")String userId);
}
